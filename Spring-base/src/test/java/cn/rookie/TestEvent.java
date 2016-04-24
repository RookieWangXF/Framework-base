package cn.rookie;

import cn.rookie.event.EmailEvent;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie
 * Description:
 */
public class TestEvent {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }
    @Test
    public void testEvent() {
        EmailEvent ele = new EmailEvent("test", "WangXf_24@163.com", "hello Rookie");
        /**
         * 主动触发事件
         */
        ctx.publishEvent(ele);
    }
}
