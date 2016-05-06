package cn.rookie.interceptor;

import cn.rookie.hello.action.HelloWorldAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Date;

/**
 * Created by Rookie on 2016/5/6.
 * Description: 拦截对应的方法
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class MyFilterInterceptor extends MethodFilterInterceptor {

    private String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {

        HelloWorldAction action = (HelloWorldAction) invocation.getAction();
        System.out.println(name + " 拦截器的动作----" + " 开始执行登录的时间:" + new Date());

        long start = System.currentTimeMillis();

        String result = invocation.invoke();
        System.out.println(name + " 拦截器的动作----" + " 执行完登录的时间:" + new Date());
        long end = System.currentTimeMillis();

        System.out.println(name + " 拦截器的动作----" + " 执行完Action的时间:" + (end - start));

        return result;
    }

    /**
     * 设置排除在外的方法
     * @param excludeMethods
     */
    @Override
    public void setExcludeMethods(String excludeMethods) {
        super.setExcludeMethods(excludeMethods);
    }

    /**
     * 设置包括的方法
     * @param includeMethods
     */
    @Override
    public void setIncludeMethods(String includeMethods) {
        super.setIncludeMethods(includeMethods);
    }
}
