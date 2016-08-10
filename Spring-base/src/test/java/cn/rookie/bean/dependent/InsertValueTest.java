package cn.rookie.bean.dependent;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.dependent
 * Description:
 */
public class InsertValueTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/dependent.xml");
    }

    @Test
    public void info() throws Exception {
        ConstructorValue constructor = (ConstructorValue) ctx.getBean("constructorValue");
        constructor.info();
    }

    @Test
    public void info2() throws Exception {
        SetValue setValue = (SetValue) ctx.getBean("setValue");
        setValue.info();
    }
}