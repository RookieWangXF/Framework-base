package cn.rookie.myaop2;

import cn.rookie.myaop.IUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop2
 * Description:
 */
public class ProxyFactoryTest {
    @Test
    public void getProxyInstance() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IUser user = (IUser) ac.getBean("user_proxy");
        System.out.println(user.getClass());
        user.save();
    }

}