package cn.rookie.aop_xml;

import cn.rookie.aop_xml.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.aop_xml
 * Description:
 */
public class ProxyFactoryTest {
    /**
     * 有接口的时候生成的是动态代理对象
     * @throws Exception
     */
    @Test
    public void getProxyInstance() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean_xml.xml");
        IUser user = (IUser) ac.getBean("userImpl");
        System.out.println(user.getClass());
        user.save();
    }
    /**
     * 无接口的时候 使用cglib代理
     * @throws Exception
     */
    @Test
    public void getProxyInstance2() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean_xml.xml");
        OrderDao user = (OrderDao) ac.getBean("orderDao");
        System.out.println(user.getClass());
        user.save();
    }

}