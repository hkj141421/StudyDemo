package FrameWork.com.nio;

import java.io.Serializable;

/**
 * Created by forget on 2019/12/3.
 */
public class message implements Serializable{

    private String msgid;

    private String magContent;

    public message() {
    }

    public String getMsgid() {
        return msgid;
    }

    public String getMagContent() {
        return magContent;
    }

    public void setMagContent(String magContent) {
        this.magContent = magContent;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public message(String msgid, String magContent) {
        this.msgid = msgid;
        this.magContent = magContent;
    }

    @Override
    public String toString() {
        return "message{" +
                "msgid='" + msgid + '\'' +
                ", magContent='" + magContent + '\'' +
                '}';
    }
}
