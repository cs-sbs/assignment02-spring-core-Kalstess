package org.example.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    // 定义切点：匹配OrderService的所有方法
    @Pointcut("execution(* org.example.service.OrderService.*(..))")
    public void orderServiceMethods() {}

    @Before("orderServiceMethods()")
    public void logBeforeMethod() {
        System.out.println("[AOP日志] 开始执行订单服务方法...");
    }

    @AfterReturning("orderServiceMethods()")
    public void logAfterMethod() {
        System.out.println("[AOP日志] 订单服务方法执行完成！");
    }
}