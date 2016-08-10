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
public class InstancFactoryTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/buildBean.xml");
    }

    @Test
    public void getUser() throws Exception {
        User chinese = ctx.getBean("chinese", User.class);
        User american = ctx.getBean("american", User.class);

        System.out.println(chinese.sayGoodBye("rookie"));
        System.out.println(american.sayGoodBye("rookie"));

    }
}