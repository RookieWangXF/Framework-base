package cn.rookie.interceptor;

import cn.rookie.hello.action.HelloWorldAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

import java.util.Date;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */

/**
 * 实现一个自定义的拦截器
 * 1. 实现Interceptor方法
 * 2. 继承抽象类
 */
public class SimpleInterceptor extends AbstractInterceptor{
    private static final long serialVersionUID = 1L;

    private static final Logger LOG = LoggerFactory.getLogger(SimpleInterceptor.class);
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        LOG.trace("entering SimpleInterceptor ...");
        if (LOG.isDebugEnabled()) {
            LOG.debug("entering SimpleInterceptor ...");
        }

        HelloWorldAction action = (HelloWorldAction) invocation.getAction();
        System.out.println(name + " 拦截器的动作----" + " 开始执行登录的时间:" + new Date());

        long start = System.currentTimeMillis();

        String result = invocation.invoke();
        System.out.println(name + " 拦截器的动作----" + " 执行完登录的时间:" + new Date());
        long end = System.currentTimeMillis();

        System.out.println(name + " 拦截器的动作----" + " 执行完Action的时间:" + (end - start));

        if (LOG.isDebugEnabled()) {
            LOG.debug("exit executing MessageStoreInterceptor");
        }
        return result;
    }
}
