package FrameWork;

import FrameWork.Aspect.ProxyInvocationHandler;
import FrameWork.Service.MusicService;
import FrameWork.ServiceImpl.MusicServiceImpl;
import FrameWork.bean.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

import java.lang.reflect.Proxy;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    @Autowired
    public DriverManagerDataSource dataSource;

    public static Log log= LogFactory.getLog(App.class);

    public static void main( String[] args )
    {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/Spring_Config.xml");
        MusicService musicService=applicationContext.getBean(MusicService.class);
        musicService.listenMusic();

    }

}
