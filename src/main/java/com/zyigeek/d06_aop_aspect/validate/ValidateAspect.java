package com.zyigeek.d06_aop_aspect.validate;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidateAspect {
    //环绕通知
    @Around("com.zyigeek.d06_aop_aspect.LogAspect.pointCut()")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        //获得方法名
        String methodName = pjp.getSignature().getName();
        //获取参数列表
        for(Object arg:pjp.getArgs()){
            int value=(int)arg;
            if(value<=0) {
                System.out.println("检验参数：the method " + methodName + " avlidate校验时发现0或负数");
                return 0;
            }
        }
        //前置通知
        System.out.println("检验参数：the method "+methodName+" 参数校验通过");
        Object result=null;
        result=pjp.proceed();
        return result;
        //返回通知
    }
}
