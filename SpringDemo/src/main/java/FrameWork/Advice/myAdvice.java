package FrameWork.Advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletContext;

/**
 * Created by forget on 2019/6/7.
 */
@Aspect
public class myAdvice {
    @After(value = "execution(* FrameWork.ServiceImpl.MusicServiceImpl.*())")
    public void doAfter()
    {
        System.out.println("后置通知");
    }
    @Before(value = "execution(* FrameWork.ServiceImpl.MusicServiceImpl.*())")
    public void doBefore()
    {
        System.out.println("前置通知");
    }
    @Around(value = "execution(* FrameWork.ServiceImpl.MusicServiceImpl.*())")
    public void doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
    }
    @AfterThrowing(throwing = "e",pointcut = "execution(* FrameWork.ServiceImpl.MusicServiceImpl.*())")
    public void doException(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
