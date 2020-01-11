package FrameWork.Aspect;

import FrameWork.Service.MusicService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by forget on 2019/6/7.
 */
public class ProxyInvocationHandler implements InvocationHandler{

    private MusicService target;

    public ProxyInvocationHandler(MusicService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("经过了动态代理");
        return method.invoke(target,args);
    }
}
