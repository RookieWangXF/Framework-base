package cn.rookie.myaop2;

import cn.rookie.myaop.Aop;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop2
 * Description:
 */
public class ProxyFactory{

    private static Object target;
    private static Aop aop;


    // 生成代理对象的方法,因为代理可以控制原来方法的执行
    public static Object getProxyInstance(Object target_,Aop aop_){

        target = target_;
        aop = aop_;

        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        System.out.println("myaop begin代理");
                        aop.begin();// 执行重复代码
                        System.out.println("myaop begin代理");
                        // 执行目标对象的方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("myaop end代理");
                        aop.commit(); // 执行重复代码
                        System.out.println("myaop end代理");

                        return returnValue;
                    }
                });
    }
}
