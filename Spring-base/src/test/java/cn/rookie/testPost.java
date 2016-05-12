package cn.rookie;

import cn.rookie.event.EmailEvent;
import cn.rookie.post.bean.Chinese;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rookie on 2016/4/25.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
class TestPost {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }
    @Test
    public void testPost() {
        Chinese c = (Chinese) ctx.getBean("chinesePost");
        c.useAxe();
    }

}
