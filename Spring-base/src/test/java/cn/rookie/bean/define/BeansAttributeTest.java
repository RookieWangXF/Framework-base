package cn.rookie.bean.define;

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
public class BeansAttributeTest {

    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/define.xml");
    }

    /**
     * 每个bean类先自己初始化，然后才是互相引用
     * @throws Exception
     */
    @Test
    public void sayInfo() throws Exception {
        BeansAttribute beansAttribute = (BeansAttribute) ctx.getBean("beansAttribute");
        beansAttribute.sayInfo();
    }

}