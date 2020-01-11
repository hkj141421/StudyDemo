package FrameWork.Bean;

import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

/**
 * Created by forget on 2019/7/9.
 */
@Document("message")
public class Message extends BaseEntity{

    private String sender;

    private String recipient;

    private String content;

    public Message(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.createDate=new Timestamp(System.currentTimeMillis());
    }

    public Message() {
        this.createDate=new Timestamp(System.currentTimeMillis());
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
