package FrameWork.Service;

import FrameWork.bean.User;

/**
 * Created by forget on 2019/6/5.
 */
public interface UserService {
    User getUser(String name,String sign) throws Exception;
    boolean login(User user);
    boolean logout(User user);
}
