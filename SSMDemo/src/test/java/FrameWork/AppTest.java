package FrameWork;

import static org.junit.Assert.assertTrue;

import FrameWork.Jmx.Monitor;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Monitor monitor=new Monitor();
        Map<String,Object> reqinfo=monitor.getRequestInfo();
        Set<String > keys=reqinfo.keySet();

        for (String k:keys) {
            System.out.println(reqinfo.get(k));
        }
    }
}
