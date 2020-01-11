package FrameWork.Dao;

import FrameWork.Bean.Message;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 * Created by forget on 2019/7/9.
 */

public interface MessageDao extends MongoRepository<Message,String>{
    @Query("{'_id':?0}")
    public Message getMessageById(String id);
}
