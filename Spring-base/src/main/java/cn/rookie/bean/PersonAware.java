package cn.rookie.bean;

import org.springframework.beans.BeansException;
import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Locale;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.bean
 * Description:
 */
public class PersonAware implements ApplicationContextAware {
    //保存BeanFactory的对象，当然也是可以实现 BeanFactoryAware
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public void sayHi(String name) {
        System.out.println(ctx.getMessage("hello",new String[]{name}, Locale.getDefault(Locale.Category.FORMAT)));
    }

}
