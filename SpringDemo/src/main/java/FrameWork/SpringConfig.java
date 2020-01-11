package FrameWork;


import FrameWork.Advice.myAdvice;
import FrameWork.Service.MusicService;
import FrameWork.Service.UserService;
import FrameWork.ServiceImpl.MusicServiceImpl;
import FrameWork.ServiceImpl.UserServiceImpl;
import FrameWork.bean.Music;
import FrameWork.bean.User;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by forget on 2019/6/7.
 */
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {

    @Bean
    public Music music()
    {
        return new Music();
    }

    @Bean
    public User user()
    {
        return new User();
    }

    @Bean
    public UserService userService()
    {
        return new UserServiceImpl();
    }

    @Bean
    public MusicService musicService()
    {
        return new MusicServiceImpl();
    }

    @Bean
    public myAdvice myAdvice()
    {
        return new myAdvice();
    }

    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mybatistest?characterEncoding=utf8&useSSL=true&serverTimezone=UTC");
        driverManagerDataSource.setPassword("root");
        driverManagerDataSource.setUsername("root");
        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(driverManagerDataSource());
        return dataSourceTransactionManager;
    }

}
