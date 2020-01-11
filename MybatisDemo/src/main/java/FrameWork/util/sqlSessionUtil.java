package FrameWork.util;

import com.sun.imageio.plugins.jpeg.JPEGImageReaderResources;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by forget on 2019/6/5.
 */
public class sqlSessionUtil {

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        InputStream inputStream= Resources.getResourceAsStream("Mybatis_Config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() throws IOException {
        SqlSessionFactory sqlSessionFactory=sqlSessionUtil.getSqlSessionFactory();
        return sqlSessionFactory.openSession();
    }

}
