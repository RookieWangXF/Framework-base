package cn.rookie.bean.aware;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Rookie on 2016/8/9.
 * Package_name is cn.rookie.bean.aware
 * Description: ApplicationContextAware 注入此容器
 */
public class ApplicationContextAwareDemo implements ApplicationContextAware {

    private static Logger logger = Logger.getLogger(ApplicationContextAwareDemo.class);

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
