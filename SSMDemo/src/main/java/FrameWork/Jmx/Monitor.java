package FrameWork.Jmx;

import org.springframework.stereotype.Component;

import javax.management.*;
import javax.management.remote.JMXConnectorServer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by forget on 2019/12/19.
 */
public class Monitor {
    public ObjectName requestObject;
    public ObjectName threadPoolObject;
    public static MBeanServerConnection connection;

    public Monitor() {
        init();
    }

    public void init(){
        connection=jmxUtil.getJmxConnector();
        try {
            requestObject=new ObjectName("Catalina:type=GlobalRequestProcessor,name=\"http-apr-8080\"");
            threadPoolObject=new ObjectName("Catalina:type=ThreadPool,name=\"http-apr-8080\"");
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        }

    }

   public Map<String,Object> getInfo(ObjectName objectName){
       HashMap<String,Object> map = new HashMap<>();
       MBeanInfo Info = jmxUtil.getMBeanInfo(connection,objectName);

       MBeanAttributeInfo[] attributeInfo=Info.getAttributes();
       for (int i=0;i<attributeInfo.length;i++)
       {
           String n=attributeInfo[i].getName();
           map.put(attributeInfo[i].getName(),getAttr(objectName,attributeInfo[i].getName()));
       }
       return map;
    }

    public Map<String,Object> getRequestInfo(){
      return getInfo(requestObject);
    }

    public Map<String,Object> getThreadInfo(){
        return getInfo(threadPoolObject);
    }

    public Map<String,String> getInfoFromMbeanInfo(){
       HashMap<String,String> res=new HashMap();
        MBeanInfo threadPoolInfo=jmxUtil.getMBeanInfo(connection,threadPoolObject);
        return null;
    }

    public Object getAttr(ObjectName objectName,String name){
        try {
           return connection.getAttribute(objectName,name);
        } catch (MBeanException e) {
            e.printStackTrace();
        } catch (AttributeNotFoundException e) {
            e.printStackTrace();
        } catch (InstanceNotFoundException e) {
            e.printStackTrace();
        } catch (ReflectionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
