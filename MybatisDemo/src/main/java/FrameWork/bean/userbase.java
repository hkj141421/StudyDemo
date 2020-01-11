package FrameWork.bean;

import org.apache.ibatis.type.Alias;

/**
 * Created by forget on 2019/6/5.
 */
public class userbase {
    private Long id;
    private String name;
    private String sign;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "userbase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
