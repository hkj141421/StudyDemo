package FrameWork.Bean;

import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

/**
 * Created by forget on 2019/7/9.
 */
@Document("user")
public class User extends BaseEntity{

    private String name;

    private String account;

    private String password;

    private String headimg;

    private String authority;

    public User(String name, String account, String password, String headimg, String authority) {
        this.name = name;
        this.account = account;
        this.password = password;
        this.headimg = headimg;
        this.authority = authority;
        this.createDate=new Timestamp(System.currentTimeMillis());

    }

    public User() {
        this.createDate=new Timestamp(System.currentTimeMillis());
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }
}
