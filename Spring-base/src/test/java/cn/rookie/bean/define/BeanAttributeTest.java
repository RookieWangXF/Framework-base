package cn.rookie.bean.define;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.define
 * Description:
 */
public class BeanAttributeTest {

    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/define.xml");
    }

    @Test
    public void info() throws Exception {
        BeanAttribute beanAttribute = (BeanAttribute) ctx.getBean("beanAttribute");
        beanAttribute.info();
    }

    /**
     * 直接调用有别名的bean
     * @throws Exception
     */
    @Test
    public void alias() throws Exception {
        BeanAttribute beanAttribute = (BeanAttribute) ctx.getBean("alias");
        Assert.assertEquals("Alias",beanAttribute.info());;
    }
}