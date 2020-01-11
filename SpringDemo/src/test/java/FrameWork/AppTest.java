package FrameWork;

import static org.junit.Assert.assertTrue;

import FrameWork.Service.MusicService;
import FrameWork.bean.Music;
import FrameWork.util.jdbcUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Autowired
    public static MusicService musicService;
    @Test
    public void shouldAnswerWithTrue()
    {
        musicService.listenMusic();
        assertTrue( true );
    }

    @Test
    public void print() throws SQLException {
        String[] str={"id","name","sign"};
        ResultSet resultSet=jdbcUtil.QueryPreparedStatement(str,"user");
        while (resultSet.next())
        {
            for (String s:str) {
                System.out.println(resultSet.getString(s));
            }
        }
    }
}
