package cn.rookie.bean.aware;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/9.
 * Package_name is cn.rookie.bean.aware
 * Description:
 */
public class ApplicationContextAwareDemoTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("bean/aware.xml");
    }

    @Test
    public void getApplicationContext() throws Exception {
        ApplicationContextAwareDemo demo = (ApplicationContextAwareDemo) applicationContext.getBean("applicationContextAwareDemo");
        BeanIdAware beanIdAware = (BeanIdAware) demo.getApplicationContext().getBean("beanIdAware");
        beanIdAware.info();
    }

}