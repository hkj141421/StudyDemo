package FrameWork.Advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by forget on 2019/6/8.
 */
public class eithAdvice {

    public void doAfter()
    {
        System.out.println("后置通知");
    }

    public void doBefore()
    {
        System.out.println("前置通知");
    }

    public void doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
    }

    public void doException(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
