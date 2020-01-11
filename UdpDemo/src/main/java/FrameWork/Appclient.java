package FrameWork;

import FrameWork.domain.UdpClient;
import FrameWork.domain.UdpServer;

/**
 * Created by forget on 2019/12/9.
 */
public class Appclient {
    public static void main( String[] args ) throws InterruptedException {

        new UdpClient().start();
    }
}
