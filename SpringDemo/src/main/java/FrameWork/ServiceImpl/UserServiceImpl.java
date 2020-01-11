package FrameWork.ServiceImpl;

import FrameWork.Service.UserService;
import FrameWork.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private User user;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setUser(User user) {
//        this.user = user;
        System.out.println("设置用户信息");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User getUser(String name,String sign) throws Exception {
            jdbcTemplate.update("insert into user(name,sign)  values('"+name+"','"+sign+"')");
//            throw new Exception("异常");
            return this.user;
    }

    @Override
    public boolean login(User user) {
        this.user=user;
        return true;
    }

    @Override
    public boolean logout(User user) {
        this.user=null;
        return false;
    }
}
