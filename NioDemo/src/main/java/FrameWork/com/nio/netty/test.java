package FrameWork.com.nio.netty;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by forget on 2019/12/2.
 */
public class test {

    public static void main(String[] arg)
    {
        try {
            Client client=new Client();
            client.start();
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {

        }

    }
}
