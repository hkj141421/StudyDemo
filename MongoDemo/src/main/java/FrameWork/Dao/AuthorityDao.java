package FrameWork.Dao;

import FrameWork.Bean.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by forget on 2019/7/9.
 */
public interface AuthorityDao extends MongoRepository<User,String>{

}
