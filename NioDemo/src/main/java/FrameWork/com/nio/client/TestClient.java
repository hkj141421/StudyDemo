package FrameWork.com.nio.client;

import FrameWork.com.nio.test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * Created by forget on 2019/11/26.
 */
public class TestClient {

    public static void main( String[] args ) throws IOException {
        Client client=new Client();
        Thread thread=new Thread(client);
        thread.start();
        Scanner scanner=new Scanner(System.in);
        String message=null;

        while(true)
        {
            message=scanner.nextLine();
            ByteBuffer byteBuffer=ByteBuffer.allocate(message.getBytes().length);
            byteBuffer.put(message.getBytes());
            byteBuffer.flip();
            client.getSocketChannel().write(byteBuffer);
        }

    }
}
