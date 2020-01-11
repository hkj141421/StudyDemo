package FrameWork.util;

import FrameWork.bean.Page;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMap;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import sun.plugin.javascript.ReflectUtil;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * Created by forget on 2019/9/28.
 */
@Intercepts({
//        @Signature(type = Executor.class,method = "query",args = {MappedStatement.class,Object.class, RowBounds.class, ResultHandler.class}),
            @Signature(type = StatementHandler.class,method = "prepare",args = {Connection.class,Integer.class})
})
public class SqlInvocation implements Interceptor{

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        RoutingStatementHandler routingStatementHandler= (RoutingStatementHandler) invocation.getTarget();

        if(routingStatementHandler.getBoundSql().getParameterObject() instanceof Page)
        {
            Page pageHelp= (Page) routingStatementHandler.getBoundSql().getParameterObject();
            HandlePage(routingStatementHandler.getBoundSql(),pageHelp, (Connection) invocation.getArgs()[0],routingStatementHandler);

        }
//            MappedStatement mappedStatement= (MappedStatement) invocation.getArgs()[0];
//            Object param=invocation.getArgs()[1];
//            BoundSql sql=mappedStatement.getBoundSql(invocation.getArgs()[1]);
//            List<ParameterMapping> list=sql.getParameterMappings();
//
//            System.out.println(list.size());
//
//            MetaObject metaObject=mappedStatement.getConfiguration().newMetaObject(param);
//            String[] get=metaObject.getGetterNames();
//
//            for (String s:get) {
//                System.out.println(s+","+metaObject.getValue(s));
//            }
//            Long start=System.currentTimeMillis();
//            invocation.proceed();
//            Long end=System.currentTimeMillis();
//            String stam=sql.getSql().replaceAll("[\\s]"," ");
//            System.out.println(stam+",执行时间："+(end-start)+"毫秒");
//            System.out.println("------");
        return invocation.proceed();
    }

    public void HandlePage(BoundSql boundSql,Page pageHelper,Connection connection,RoutingStatementHandler routingStatementHandler) throws SQLException {

        StatementHandler statementHandler = (StatementHandler) reflectUtil.getFildValue(routingStatementHandler,"delegate");

        MappedStatement mappedStatement= (MappedStatement) reflectUtil.getFildValue(statementHandler,"mappedStatement");

        //获取总条数
        Integer count=this.CountAmount(mappedStatement,boundSql,pageHelper,connection);
        //设置总页数
        pageHelper.setTotalPage(count);
        //获取分页sql
        String pageSql=this.getPageSql(boundSql.getSql(),pageHelper);

        pageHelper.setSql(pageSql);

        reflectUtil.setFildValue(boundSql,"sql",pageSql);

    }

    /**
     * 获取SQL语句结果集的总数量
     * @param mappedStatement
     * @param boundSql 用于获取原sql和参数映射关系
     * @param params sql语句的参数
     * @param connection 数据库连接用于执行sql语句
     * @return
     * @throws SQLException
     */
    public Integer CountAmount(MappedStatement mappedStatement,BoundSql boundSql,Object params,Connection connection) throws SQLException {

        String countSql=this.getCountSql(boundSql.getSql());

        System.out.println(countSql);

        List<ParameterMapping> parameterMappingList=boundSql.getParameterMappings();
        //构建统计数量的sql语句的BoundSql对象
        BoundSql countBoundSql=new BoundSql(mappedStatement.getConfiguration(),countSql,parameterMappingList,params);
        //创建一个参数映射器，帮助我们给sql语句赋值
        ParameterHandler parameterHandler=new DefaultParameterHandler(mappedStatement,params,countBoundSql);

        PreparedStatement statement=null;

        ResultSet resultSet=null;

        try{
            statement=connection.prepareStatement(countSql);
            //给统计语句的sql语句占位符赋值
            parameterHandler.setParameters(statement);

            resultSet=statement.executeQuery();

            Integer count=0;

            if(resultSet.next()){
                count=resultSet.getInt(1);
                System.out.println("数量："+count);
            }

            return count;
        }
        finally {

           // if(resultSet!=null)resultSet.close();

         //   if(statement!=null)statement.close();


        }
    }

    /**
     * 获取分页sql
     * @param sql
     * @param pageHelper
     * @return
     */
    public String getPageSql(String sql,Page pageHelper){
        int start=(pageHelper.getIndexPage()-1)*pageHelper.getPageNum();
        int end=start+pageHelper.getPageNum();
        return "select * from ( "+sql+" ) pagedata limit "+start+","+end;
    }

    /**
     * 构建统计sql语句
     * @param sql
     * @return
     */
    public String getCountSql(String sql){
        return "select count(*) "+sql.substring(sql.indexOf("from"));
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
