package FrameWork.Bean;

import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

/**
 * Created by forget on 2019/7/10.
 */
public class BaseEntity {

    protected Timestamp createDate;

    @Id
    protected String id;

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
