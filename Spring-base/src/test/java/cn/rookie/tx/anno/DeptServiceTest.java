package cn.rookie.tx.anno;

import cn.rookie.tx.Dept;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.tx.anno
 * Description:
 */
public class DeptServiceTest {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("tx/beanAnno.xml");
    }
    @Test
    public void save() throws Exception {
        DeptService deptService = (DeptService) ctx.getBean("deptService");
        Dept p = new Dept();
        p.setDeptName("sdfgsfd");
        deptService.save(p);
    }

}