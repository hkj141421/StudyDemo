package FrameWork.DAO;

import FrameWork.bean.Page;
import FrameWork.bean.TESTDATE;
import FrameWork.bean.userbase;

import java.util.List;

/**
 * Created by forget on 2019/6/5.
 */
public interface UserMapper {

   List<userbase> selectUser(Page page);

   TESTDATE insertTest(TESTDATE  T);

}
