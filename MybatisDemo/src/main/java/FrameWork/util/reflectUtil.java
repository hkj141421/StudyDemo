package FrameWork.util;

import java.lang.reflect.Field;

/**
 * Created by forget on 2019/9/29..
 * 反射工具类
 */
public class reflectUtil {

    public static boolean setFildValue(Object object,String filed,Object value){
        Class cls=object.getClass();
        Field f=null;
        Object res=null;
        try {
            f = cls.getDeclaredField(filed);
            f.setAccessible(true);
            f.set(object,value);
            return true;
        } catch (Exception e) {
           return false;
        }
    }

    public static Object getFildValue(Object object,String filed){
        Field f=null;
        Object res=null;

            for(Class cls=object.getClass();cls!=Object.class;cls=cls.getSuperclass())
            {
                try {
                    f = cls.getDeclaredField(filed);
                    f.setAccessible(true);
                    res=f.get(object);
                    break;
                } catch (Exception e) {

                }
            }
            return res;


    }

}
