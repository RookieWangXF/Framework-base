package cn.rookie;

import cn.rookie.annotation.bean.PersonAnno;
import cn.rookie.annotation.bean.PersonAnnoConfig;
import cn.rookie.annotation.controller.PersonControAnno;
import cn.rookie.annotation.dao.PersonDaoAnno;
import cn.rookie.annotation.service.PersonServiceAnno;
import cn.rookie.bean.PersonAware;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rookie on 2016/4/25.
 * Package name is cn.rookie
 * Description:
 */
public class TestAnno {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beansAnno.xml");
    }

    @Test
    public void testDao() {
        PersonDaoAnno p = (PersonDaoAnno) ctx.getBean("personDaoAnno");
        p.say();
    }

    @Test
    public void testBean() {
        PersonAnno p = (PersonAnno) ctx.getBean("personAnno");
        p.say();
    }
    @Test
    public void testService() {
        PersonServiceAnno p = (PersonServiceAnno) ctx.getBean("personServiceAnno");
        p.say();
    }
    @Test
    public void testContro() {
        PersonControAnno p = (PersonControAnno) ctx.getBean("personControAnno");
        p.say();
    }

    @Test
    public void testPersonAnnoConfig() {
        PersonAnnoConfig p = (PersonAnnoConfig) ctx.getBean("personAnnoConfigvalue");
        p.say();
    }
}
