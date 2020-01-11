package FrameWork.Controller;

import FrameWork.Bean.Message;
import FrameWork.Bean.User;
import FrameWork.Dao.MessageDao;
import FrameWork.Dao.AuthorityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 * Created by forget on 2019/7/9.
 */
@Controller
public class MongoBoot {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    MessageDao messageDao;

    @Autowired
    AuthorityDao authorityDao;

    @RequestMapping("/search")
    public String start(HttpServletRequest request){

        List<Message> list= Arrays.asList(new Message("admin","群消息","acsac"),
                new Message("admin","群消息","caskjsaacbcjka"),
                new Message("admin","群消息","caskcacajbcjka"),
                new Message("admin","群消息","acsac"),
                new Message("admin","群消息","acasca"));

        List<User> list2=Arrays.asList(new User("admscin","670378784","acajsbcab","acascajb","adscmin"),
                new User("admscin","670378sc784","acajscssbcab","acassccajb","adscmin"),
                new User("admcsin","670378scsc784","acajsbcab","acascscajb","admscin"));
//        messageDao.saveAll(list);

//        mongoTemplate.insertAll(list2);

        ExampleMatcher exampleMatcher=ExampleMatcher.matchingAny().withMatcher("content", ExampleMatcher.GenericPropertyMatchers.startsWith());
        ExampleMatcher.matchingAll().withMatcher("arr",ExampleMatcher.GenericPropertyMatchers.regex());
        Message message=new Message();
        message.setContent("/a/");
        Example example=Example.of(message,exampleMatcher);

        request.setAttribute("list",messageDao.findAll(example));
        return "index";
    }

    @RequestMapping("/")
    public String start(){
        return "search";
    }


}
