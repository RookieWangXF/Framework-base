package cn.rookie.bean.aware;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.aware
 * Description:
 */
public class GetXMLConfigTest {

    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/aware.xml");
    }

    @Test
    public void getAttribute() {
        System.out.println(ctx.getBean("son"));
    }
    @Test
    public void getStatic() {
        System.out.println(ctx.getBean("theAge"));
    }

    @Test
    public void getMethod() {
        System.out.println(ctx.getBean("method"));
    }
}