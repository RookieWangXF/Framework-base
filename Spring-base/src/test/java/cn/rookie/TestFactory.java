package cn.rookie;

import cn.rookie.bean.buildBean.Being;
import cn.rookie.bean.buildBean.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie
 * Description:
 */
public class TestFactory {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void testStatic() {
        Being dog = ctx.getBean("dog", Being.class);
        dog.testBeing();
        Being cat = ctx.getBean("cat", Being.class);
        cat.testBeing();
    }

    @Test
    public void testDymnic() {
        User u = (User) ctx.getBean("chinese");
        System.out.println(u.sayGoodBye("feifei"));
        System.out.println(u.sayHello("fefe"));

        User u2 = (User) ctx.getBean("usa");
        System.out.println(u2.sayGoodBye("feifei"));
        System.out.println(u2.sayHello("fefe"));
    }
}
