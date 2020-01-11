package FrameWork.Jmx;

import javax.management.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by forget on 2019/12/18.
 */
public class jmxUtil {

    private static String url="service:jmx:rmi:///jndi/rmi://127.0.0.1:9999/jmxrmi";

    private static String[] usernameAndpassword=new String[]{"monitorRole","tomcat"};

    private static boolean needAuth=true;


    public static MBeanServerConnection getJmxConnector(){
        JMXConnector connector=null;
        MBeanServerConnection connection=null;
        try {
            JMXServiceURL jmxServiceURL=new JMXServiceURL(url);
            Map<String,String[]> map=new HashMap();
            map.put(JMXConnector.CREDENTIALS,usernameAndpassword);

            if(needAuth)
            {
                System.out.println("开启验证");
                 connector=JMXConnectorFactory.connect(jmxServiceURL,map);
            }
            else connector=JMXConnectorFactory.connect(jmxServiceURL);

            connection=connector.getMBeanServerConnection();
            if (connection!=null) System.out.println("JMX连接成功");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static MBeanInfo getMBeanInfo(MBeanServerConnection connection, ObjectName objectName)
    {
        try {
           return connection.getMBeanInfo(objectName);
        } catch (InstanceNotFoundException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (ReflectionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
