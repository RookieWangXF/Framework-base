package cn.rookie.bean.aware;

import cn.rookie.annotation.dao.PersonDaoAnno;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/9.
 * Package_name is cn.rookie.bean.aware
 * Description:测试是否注入了BeanFactory
 */
public class BeanFactoryAwareDemoTest {

    private BeanFactory beanFactory;

    @Before
    public void setUp() throws Exception {
        beanFactory = new ClassPathXmlApplicationContext("bean/aware.xml");
    }

    @Test
    public void testBeanFactoryAware() {
        BeanFactoryAwareDemo demo = (BeanFactoryAwareDemo) beanFactory.getBean("beanFactoryAwareDemo");
        BeanIdAware beanIdAware = (BeanIdAware) demo.getBeanFactory().getBean("beanIdAware");
        beanIdAware.info();
    }
}