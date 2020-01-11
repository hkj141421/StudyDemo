package FrameWork;

import static org.junit.Assert.assertTrue;

import FrameWork.DAO.UserMapper;
import FrameWork.bean.Page;
import FrameWork.bean.User;
import FrameWork.bean.userbase;
import FrameWork.util.MybatisConfig;
import FrameWork.util.sqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void getUser() throws IOException {
        SqlSession sqlSession= sqlSessionUtil.getSqlSession();
        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
        userbase user=new userbase();
        user.setId(1L);
        Page page=new Page();
        page.setPageNum(3);
        page.setParamsMap("name","jascasj");
        List<userbase> list= userMapper.selectUser(page);
        for (userbase u:list) {
            System.out.println(u);
        }
        System.out.println("总页数："+page.getTotalPage());
    }
}
