package FrameWork;

import FrameWork.com.nio.netty.NettyServer;
import FrameWork.com.nio.server.NioServer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       new NettyServer().start(8080);
    }
}
