package cn.rookie;

import cn.rookie.bean.Person;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.util.Date;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie
 * Description: ApplicationContext 是访问容器内部的接口类
 */
public class TestBeans {
    /**
     * 使用BeanFactory容器
     */
    @Test
    public void testDefaultListableBeanFactory(){
        Resource isr = new ClassPathResource("beans.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(isr);
        Person p = (Person) beanFactory.getBean("person");
        p.useAxe();
    }
    @Test
    public void testDefaultListableBeanFactory2(){
        Resource isr = new FileSystemResource("src/main/resources/beans.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(isr);
        Person p = (Person) beanFactory.getBean("person");
        p.useAxe();
    }
    /**
     * 使用ApplicationContext容器
     * 1. ClassPathXmlApplicationContext 从类加载路劲下搜索配置文件,类加载器总是稳定的
     * 2. FileSystemXmlApplicationContext 从文件系统的相对路径或者绝对路径去搜索配置文件
     * 优点：可以加载多个配置文件，构造函数重载了
     */
    @Test
    public void testClassPathXmlApplicationContext(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Person p = (Person) ctx.getBean("person");
        p.useAxe();

    }

    @Test
    public void testFileSystemXmlApplicationContext(){
        ApplicationContext fsx = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");
        Person p = (Person) fsx.getBean("person");
        p.useAxe();
    }

    @Test
    public void testClassPathXmlApplicationContextMutil(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml","beansCopy.xml");
        Person p = (Person) ctx.getBean("person");
        p.useAxe();
    }

    @Test
    public void getDate() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Date date = (Date) ctx.getBean("date");
        System.out.println(date.toString());
    }
}
