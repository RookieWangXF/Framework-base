package cn.rookie.bean.scope;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.scope
 * Description:
 */
public class PrototypeTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/scope.xml");
    }

    @Test
    public void testSin() {
        Singleton singleton = (Singleton) ctx.getBean("singleton");
        Assert.assertEquals(singleton,(Singleton) ctx.getBean("singleton"));
    }

    @Test
    public void testPro() {
        Prototype prototype = (Prototype) ctx.getBean("prototype");
        Assert.assertNotEquals(prototype,(Prototype) ctx.getBean("prototype"));
    }
}