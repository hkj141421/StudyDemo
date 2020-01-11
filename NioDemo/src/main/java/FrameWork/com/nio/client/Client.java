package FrameWork.com.nio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * Created by forget on 2019/11/26.
 */
public class Client implements Runnable{

    private Selector selector;

    private SocketChannel socketChannel;

    public Client() throws IOException {
        selector=Selector.open();
        socketChannel=SocketChannel.open();
    }

    public void start() throws IOException {
        socketChannel.configureBlocking(false);
        boolean res=socketChannel.connect(new InetSocketAddress("localhost",8011));
        if(res)
        {
            System.out.println("连接就绪");
            socketChannel.register(selector, SelectionKey.OP_READ);
        }
        else {
            socketChannel.register(selector,SelectionKey.OP_CONNECT);
        }
    }

    @Override
    public void run() {
        try {
            start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(true){
            try {
                selector.select(1000);
                Iterator<SelectionKey> keys=selector.selectedKeys().iterator();
                SelectionKey key=null;
                while (keys.hasNext())
                {
                    key=keys.next();
                    keys.remove();
                    if(key.isValid())
                    {
                        if(key.isReadable())
                        {
                            SocketChannel socketChannel= (SocketChannel) key.channel();
                            ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
                            int l=socketChannel.read(byteBuffer);
                            if(l>0)
                            {
                                byteBuffer.flip();
                                byte [] bytes=new byte[byteBuffer.remaining()];
                                byteBuffer.get(bytes);
                                String body=new String(bytes,"UTF-8");
                                System.out.println("消息大小:"+bytes.length);
                                System.out.println("收到服务器消息："+body);
                            }
                            else if(l<0)
                            {
                                key.cancel();
                                socketChannel.close();
                            }
                        }

                        if(key.isConnectable())
                        {
                            SocketChannel sc= (SocketChannel) key.channel();
                            if(sc.finishConnect())
                            {
                                sc.register(selector,SelectionKey.OP_READ);
                                System.out.println("连接服务器成功");
                                write("hello world!",socketChannel);
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }

    }

    public void write(String message, SocketChannel serverSocketChannel) throws IOException {
        byte [] bytes=message.getBytes();
        ByteBuffer byteBuffer=ByteBuffer.allocate(bytes.length);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        serverSocketChannel.write(byteBuffer);
    }

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public SocketChannel getSocketChannel() {
        return socketChannel;
    }

    public void setSocketChannel(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;
    }
}
