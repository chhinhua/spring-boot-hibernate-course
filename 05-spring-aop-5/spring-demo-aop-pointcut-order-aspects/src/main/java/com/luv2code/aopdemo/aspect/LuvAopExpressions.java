package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Chhin_Hua - 13/03
 **/

public class LuvAopExpressions {

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    private void forDaoPackage() {
    }


    // create pointcut for setter method
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
    private void setter() {
    }

    // create pointcut for getter method
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
    private void getter() {
    }

    // create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNotGetterSetter() {}

}
