package cn.rookie.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.jdbc
 * Description:
 */
public class UserDaoTest {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("jdbc/bean.xml");
    }

    @Test
    public void save() throws Exception {
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        boolean res = userDao.save();
        Assert.assertEquals(res,false);
    }

}