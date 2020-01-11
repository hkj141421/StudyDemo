package FrameWork.com.nio.job;

import FrameWork.com.nio.netty.Client;
import io.netty.channel.ChannelFuture;

/**
 * Created by forget on 2019/12/13.
 */
public class ReconectionJon implements Runnable{

    private Client client;

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
            System.out.println("重连服务器....");
            this.client.start();
    }
}
