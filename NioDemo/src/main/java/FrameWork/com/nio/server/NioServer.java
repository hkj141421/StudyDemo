package FrameWork.com.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * Created by forget on 2019/11/26.
 */
public class NioServer implements Runnable{

    private ServerSocketChannel serverSocketChannel;

    private String host="localhost";

    private Selector selector;

    private int port=8011;

    public NioServer() {
    }

    public NioServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void start() throws IOException {
        selector=Selector.open();
        serverSocketChannel=ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(host,port));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    @Override
    public void run() {
        try {
            start();
            System.out.println("开启服务器,地址是"+host+":"+port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true){
            try {
                if(selector.select(1000)==0)
                {
                    System.out.print(".");
                    continue;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Iterator<SelectionKey> keys=selector.selectedKeys().iterator();
                SelectionKey key=null;
                try{
                   while (keys.hasNext()) {
                       key = keys.next();
                       keys.remove();
                       if (key.isValid()) {
                           if (key.isReadable()) {
                               SocketChannel socketChannel = (SocketChannel) key.channel();
                               ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                               int l = socketChannel.read(byteBuffer);
                               if (l > 0) {
                                   byteBuffer.flip();
                                   byte[] bytes = new byte[byteBuffer.remaining()];
                                   byteBuffer.get(bytes);
                                   String body = new String(bytes, "UTF-8");
                                   System.out.println("消息内容：" + body);
                                   write("你好，客户端，收到消息：" + body, socketChannel);
                               } else if (l < 0) {
                                   key.cancel();
                                   socketChannel.close();
                               }
                           }

                           if (key.isAcceptable()) {
                               ServerSocketChannel socketChannel = (ServerSocketChannel) key.channel();
                               SocketChannel sc = socketChannel.accept();
                               sc.configureBlocking(false);
                               sc.register(selector, SelectionKey.OP_READ);
                           }
                       }
                   }

                   }catch (IOException e)
                {

                }
        }
    }

    public void write(String message,SocketChannel socketChannel) throws IOException {
        byte [] bytes=message.getBytes();
        ByteBuffer byteBuffer=ByteBuffer.allocate(bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
    }
}
