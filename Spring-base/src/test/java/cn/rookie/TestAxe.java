package cn.rookie;

import cn.rookie.bean.Person;
import cn.rookie.bean.PersonCollection;
import cn.rookie.service.impl.CNPersonImpl;
import cn.rookie.service.impl.PersonConImpl2;
import cn.rookie.service.impl.PersonConServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie
 * Description:
 */
public class TestAxe {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void testInterface(){
        CNPersonImpl p = (CNPersonImpl) ctx.getBean("cnPerson");
        p.useAxe();
    }
    @Test
    public void testInterface2(){
        /**
         * requiredType type the bean must match. Can be an interface or superclass
         * of the actual class
         */
        CNPersonImpl p = ctx.getBean("cnPerson2",CNPersonImpl.class);
        p.useAxe();
    }

    @Test
    public void testConstructor(){

        PersonConServiceImpl p = ctx.getBean("conPerson",PersonConServiceImpl.class);
        p.useAxe();
    }

    @Test
    public void testConstructor2(){
        if (ctx.containsBean("conPerson2")) {
            PersonConImpl2 p = ctx.getBean("conPerson2",PersonConImpl2.class);
            p.useAxe();
        }

    }

    /**
     * 可以不使用id找到运行的bean,但要求是此bean是唯一的
     */
    @Test
    public void testConstructor3(){
        PersonConImpl2 p = ctx.getBean(PersonConImpl2.class);
        p.useAxe();
    }

    @Test
    public void testInit() {
        //加载的时候即创建实例
    }

    /**
     * 测试使用别名
     */
    @Test
    public void testName(){
        Person p = (Person) ctx.getBean("#123");
        p.useAxe();
    }
    /**
     * 测试作用域
     */
    @Test
    public void testType(){
        Person p1 = (Person) ctx.getBean("#123");
        Person p2 = (Person) ctx.getBean("#123");
        System.out.println(p1 == p2);
    }
    /**
     * 测试集合
     */
    @Test
    public void testCollection(){
        PersonCollection p = (PersonCollection) ctx.getBean("personCollection");
        p.test();
    }

    /**
     * 测试get 到类中的某一个属性，必须有get方法
     */
    @Test
    public void testGetPerson(){
        System.out.println(ctx.getBean("getPerson"));
    }

    /**
     * 获取静态方法中的值
     */
    @Test
    public void testgetAge(){
        System.out.println(ctx.getBean("getAge"));
    }
}
