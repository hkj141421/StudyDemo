package FrameWork;

import FrameWork.domain.UdpServer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        new UdpServer().start();
    }
}
