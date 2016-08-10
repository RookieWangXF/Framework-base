package cn.rookie.bean.life;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.life
 * Description:
 */
public class DisposableBeanLifeTest {
    private AbstractApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/life.xml");
    }

    @Test
    public void destroy() throws Exception {
        DisposableBeanLife disposableBeanLife = ctx.getBean("disposableBeanLife", DisposableBeanLife.class);
        disposableBeanLife.useAxe();
        ctx.registerShutdownHook(); //可关闭容器
    }

}