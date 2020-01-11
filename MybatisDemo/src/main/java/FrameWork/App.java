package FrameWork;

import FrameWork.bean.TESTDATE;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import netscape.javascript.JSObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static void insert(String json)
    {
        JSONObject jsonObject=JSONObject.parseObject(json);
        JSONArray jsonArray=jsonObject.getJSONArray("list");
        for (int i=1;i<jsonArray.size();i++)
        {
                TESTDATE testdate=new TESTDATE();
                JSONObject jsonObject1=jsonArray.getJSONObject(i);
                testdate.DATE1=jsonObject.getString("");
            testdate.DATE2=jsonObject.getString("");
            testdate.DATE3=jsonObject.getString("");
            testdate.DATE4=jsonObject.getString("");
            testdate.DATE5=jsonObject.getString("");
            testdate.DATE6=jsonObject.getString("");
            testdate.DATE7=jsonObject.getString("");
            testdate.DATE8=jsonObject.getString("");
            testdate.DATE9=jsonObject.getString("");
            testdate.DATE10=jsonObject.getString("");
            testdate.DATE11=jsonObject.getString("");
            testdate.DATE12=jsonObject.getString("");
            testdate.DATE13=jsonObject.getString("");
        }


    }
}
