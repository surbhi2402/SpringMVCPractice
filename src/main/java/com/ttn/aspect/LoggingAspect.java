package com.ttn.aspect;

import com.ttn.exercise2.Triangle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    /*@Before("within(com.ttn.exercise2.*)")
    public void loggingBeforeAdvice() {
        System.out.println("Logging Advice (Before) is called!");
    }

    @After("allMethods()")
    public void loggingAfterAdvice() {
        System.out.println("Logging Advice (After) is called!");
    }

    @Before("allGetters()")
    public void allGetMethods() {
        System.out.println("All get method logging called!");
    }

    @AfterThrowing("execution(* com.ttn.exercise2.Triangle.*(..))")
    public void afterExceptionAdvice() {
        System.out.println("Logging Advice called after Runtime exception!");
    }

    @Before("allSetters()")
    public void allSetMethods() {
        System.out.println("All set method logging called");
    }*/

    /*@Before("triangleObject()")
    public void allTriangleMethod() {
        System.out.println("Logging called for triangle methods!");
    }*/

    /*@Before("args(name)")
    public void methodsWithStringArgs(String name) {
        System.out.println("Methods that take String arguments with value -> "+ name);
    }*/

    /*@Before("beanOfShapeService()")
    public void loggingAdviceForShapeServiceBean() {
        System.out.println("Logging advice called for Shape service bean!");
    }*/

    @Before("allSetters()")
    public void allGetterMethodsAdvice(JoinPoint joinPoint) {
        System.out.println("Logging advice for all Getter methods!!"+ joinPoint.toString());
        Triangle triangle = (Triangle)joinPoint.getTarget();
        System.out.println("Triangle Name -> "+ triangle.name);
    }

    @Pointcut("execution(* com.ttn.exercise2.Triangle.set*(..))")
    public void allSetters() {
    }

    @Pointcut("execution(* com.ttn.exercise2.Circle.get*(..))")
    public void allGetters() {
    }

    @Pointcut("execution(* *(..))")
    public void allMethods() {
    }

    @Pointcut("this(com.ttn.exercise2.Triangle)")
    public void triangleObject() {}

    @Pointcut("bean(shapeService)")
    public void beanOfShapeService() {}
}
