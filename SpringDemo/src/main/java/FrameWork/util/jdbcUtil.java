package FrameWork.util;

import java.sql.*;

/**
 * Created by forget on 2019/6/8.
 */
public class jdbcUtil {

    private static String driver="com.mysql.cj.jdbc.Driver";

    private static String url="jdbc:mysql://localhost:3306/mybatistest?characterEncoding=utf8&useSSL=true&serverTimezone=UTC";

    private static String username="root";

    private static String password="root";

    public static Connection getConnection() {
        try {
            Class.forName(jdbcUtil.driver);
            Connection connection= DriverManager.getConnection(jdbcUtil.url,jdbcUtil.username,jdbcUtil.password);
            return connection;
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("找不到驱动");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static PreparedStatement ExecutePreparedStatement(String sql){
        try {
            PreparedStatement preparedStatement=jdbcUtil.getConnection().prepareStatement(sql);
            return preparedStatement;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Sql命令:"+sql);
        }
        return null;
    }

    public static Statement getStatement(String sql){
        try {
            Statement statement=jdbcUtil.getConnection().createStatement();
            return statement;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Sql命令:"+sql);
        }
        return null;
    }

    public static ResultSet QueryPreparedStatement(String[] Column,String tablename)
    {
        StringBuffer stringBuffer=new StringBuffer("select ");
        for (int i=0;i<Column.length;i++)
        {
            stringBuffer.append(Column[i]+",");
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        stringBuffer.append(" from "+tablename);
        PreparedStatement preparedStatement=jdbcUtil.ExecutePreparedStatement(stringBuffer.toString());
        try {
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("sql语句："+stringBuffer);
            e.printStackTrace();
        }
        return null;
    }

    public static void setDriver(String driver) {
        jdbcUtil.driver = driver;
    }

    public static String getDriver() {
        return driver;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        jdbcUtil.url = url;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        jdbcUtil.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        jdbcUtil.password = password;
    }
}
