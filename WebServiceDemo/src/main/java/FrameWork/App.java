package FrameWork;


import com.forget.cxf.webservice.GetInfo;
import com.forget.cxf.webservice.ObjectFactory;
import com.forget.cxf.webservice.impl.UserServiceImplService;

import javax.xml.ws.Endpoint;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//        UserServiceImplService userServiceImplService=new UserServiceImplService();
//        String res=userServiceImplService.getUserServiceImplPort().getInfo("1212");
//        System.out.println("调用结果："+res);
        URL url=new URL("http://localhost:8080/cxfservices/admin");
        HttpURLConnection connection=(HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");

        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type","text/xml; charset=ISO-8859-1");

        String body="<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <soap:Body>\n" +
                "    \t<tns:sayhi xmlns:tns=\"http://Impl.webservice.cxf.forget.com/\">\n" +
                "    \t\t<name>knscsc</name>\n" +
                "    \t</tns:sayhi>\n" +
                "    </soap:Body>\n" +
                "</soap:Envelope>";

         connection.getOutputStream().write(body.getBytes());

         connection.connect();

         String res=connection.getResponseMessage();
         InputStreamReader inputStreamReader=new InputStreamReader(connection.getInputStream());
         BufferedReader reader=new BufferedReader(inputStreamReader);
         String s=null;
         while ((s=reader.readLine())!=null)
         {
             System.out.println(s);
         }
    }


}
