package cn.rookie.bean.auto;

import cn.rookie.bean.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.auto
 * Description:
 */
public class AutoTest {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("bean/auto.xml");
    }

    @Test
    public void testByName() {
        Person p = (Person) applicationContext.getBean("person");
        p.useAxe();
    }
    @Test
    public void testByType() {
        Person p = (Person) applicationContext.getBean("person2");
        p.useAxe();
    }
}