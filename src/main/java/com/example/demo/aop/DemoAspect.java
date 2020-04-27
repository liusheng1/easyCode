package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Aspect 注解 使之成为切面类
 * @Component 注解 把切面类加入到IOC容器中
 */
@Aspect
@Component
public class DemoAspect {

    @Pointcut( "execution(  * com.example.demo.controller.*.*(..) )")
    public void doPointcut(){
    }

    @Before("doPointcut()")
    public void doBefore(){
        System.out.println("==doBefore==");
    }

    @After("doPointcut()")
    public void doAfter(){
        System.out.println("==doAfter==");
    }

    @AfterReturning("doPointcut()")
    public void doAfterReturning(){
        System.out.println("==doAfterReturning==");
    }

    /**
     * 返回值类型Object，对应所有被拦截方法的返回值类型，不能为void
     */
    @Around("doPointcut()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("==doAround.before==");
        Object ret=proceedingJoinPoint.proceed();
        System.out.println("==doAround.after==");
        return ret;
    }
}