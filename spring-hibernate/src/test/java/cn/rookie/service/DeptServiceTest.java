package cn.rookie.service;

import cn.rookie.bean.Dept;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.service
 * Description:
 */
public class DeptServiceTest {

    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void save() throws Exception {
        DeptService deptService = (DeptService) ctx.getBean("deptService");
        System.out.println(deptService);
        Dept dept = new Dept();
        dept.setId(1);
        dept.setName("中文");
        deptService.save(dept);

    }

}