package cn.rookie.jdbc;

import cn.rookie.jdbc.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.jdbc
 * Description:
 */
public class UserDaoJdbcTemplateTest {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("jdbc/bean.xml");
    }

    @Test
    public void save() throws Exception {
        UserDaoJdbcTemplate userDaoJdbcTemplate = (UserDaoJdbcTemplate) ctx.getBean("userDaoJdbcTemplate");
        userDaoJdbcTemplate.save();

    }

    @Test
    public void findById() throws Exception {
        UserDaoJdbcTemplate userDaoJdbcTemplate = (UserDaoJdbcTemplate) ctx.getBean("userDaoJdbcTemplate");
        User user = userDaoJdbcTemplate.findById(2);
        System.out.println(user);
    }

    @Test
    public void getAll() throws Exception {
        UserDaoJdbcTemplate userDaoJdbcTemplate = (UserDaoJdbcTemplate) ctx.getBean("userDaoJdbcTemplate");
        List<User> all = userDaoJdbcTemplate.getAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}