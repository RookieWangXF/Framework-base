package cn.rookie;

import cn.rookie.bean.BeanIdAware;
import cn.rookie.bean.PersonAware;
import cn.rookie.event.EmailEvent;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie
 * Description: 通过bean来获取bean容器
 */
public class TestAware {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }
    @Test
    public void testAware() {
        PersonAware p = (PersonAware) ctx.getBean("personAware");
        p.sayHi("leilei"); //需要设立资源文件
    }

    @Test
    public void testAwareName() {
        BeanIdAware name = (BeanIdAware) ctx.getBean("beanIdAware");
        name.info();
    }

}
