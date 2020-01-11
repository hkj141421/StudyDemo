package FrameWork.Service;

import FrameWork.Dao.UserMapper;
import FrameWork.bean.User;
import FrameWork.bean.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by forget on 2019/6/13.
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> SelectAllUser(String name)
    {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andNameLike("%"+name+"%");
        List<User> list=userMapper.selectByExample(userExample);
        return list;
    }
}
