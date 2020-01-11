package com.study.Controller;

import com.study.Dao.UserMapper;
import com.study.bean.User;
import com.study.bean.UserExample;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.thymeleaf.expression.Maps;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Created by forget on 2019/6/15.
 */
@Controller
public class TestController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    UserMapper userMapper;

    @PostMapping("/login")
    public String Test(HttpServletRequest request){
        User user=new User();
        request.setAttribute("user",user);
        return "index";
    }

    @GetMapping("/")
    @ResponseBody
    public List<User> Test01(){
        return userMapper.selectByExample(new UserExample());
    }

    @PostMapping("/upload")
    public String uploadFile(MultipartHttpServletRequest request, List<MultipartFile> files) throws FileUploadException, IOException {

        for (MultipartFile item:files) {
            System.out.println(item.getName());
            item.transferTo(new File("C:\\Users\\forget\\Desktop\\"+System.currentTimeMillis()+".pdf"));
            System.out.println(item.getOriginalFilename());
        }
        request.setAttribute("res","上传成功");
        System.out.println(files.size());
        return "result";
    }
}
