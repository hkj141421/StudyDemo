package FrameWork.util;


import FrameWork.bean.Page;
import FrameWork.bean.User;
import FrameWork.bean.userbase;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by forget on 2019/6/5.
 */
public class MybatisConfig {

    public static SqlSessionFactory  ConfigurationMybatis()
    {

        Properties properties=new Properties();
        properties.setProperty("url","jdbc:mysql://localhost:3306/mybatistest?characterEncoding=utf8&useSSL=true&serverTimezone=UTC");
        properties.setProperty("driver","com.mysql.cj.jdbc.Driver");
        properties.setProperty("username","root");
        properties.setProperty("password","root");

        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
        pooledDataSourceFactory.setProperties(properties);//配置数据源属性
        DataSource dataSource=pooledDataSourceFactory.getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();//事务管理器为JDBC
        Environment environment = new Environment("development", transactionFactory, dataSource);//配置开发环境
        Configuration configuration = new Configuration(environment);//将环境加入配置
        configuration.addInterceptor(new SqlInvocation());//配置sql拦截器

        configuration.getTypeAliasRegistry().registerAlias("userbase",userbase.class);
        configuration.getTypeAliasRegistry().registerAlias("Page", Page.class);
        configuration.addMappers("FrameWork/DAO");//注册接口
        //configuration.setLogImpl(Log4jImpl.class);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);//根据配置生产SqlSessionFactory对象
        return sqlSessionFactory;
    }

    public static SqlSession getSession()
    {
        SqlSessionFactory sqlSessionFactory = MybatisConfig.ConfigurationMybatis();//根据配置生产SqlSessionFactory对象
        return sqlSessionFactory.openSession();
    }
}
