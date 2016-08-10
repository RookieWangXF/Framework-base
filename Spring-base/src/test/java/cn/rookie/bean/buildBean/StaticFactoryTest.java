package cn.rookie.bean.buildBean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.buildBean
 * Description:
 */
public class StaticFactoryTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/buildBean.xml");
    }
    @Test
    public void getBeing() throws Exception {
        Being dog = ctx.getBean("dog", Being.class);
        Being cat = ctx.getBean("cat", Being.class);
        dog.testBeing();
        cat.testBeing();
    }

}