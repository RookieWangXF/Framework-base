package cn.rookie.myaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop
 * Description:
 */
public class UserImplTest {

    @Test
    public void save() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserImpl user = (UserImpl) ac.getBean("userImpl");
        user.save();
    }

}