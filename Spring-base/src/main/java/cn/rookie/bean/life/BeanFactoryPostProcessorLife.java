package cn.rookie.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by Rookie on 2016/4/25.
 * Description:容器后处理器，对容器本身进行处理，不涉及内部的具体的Bean
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class BeanFactoryPostProcessorLife implements BeanFactoryPostProcessor{

    /**
     * Spring的ApplicationContext会默认扫描实现了BeanFactoryPostProcessor接口的子类，并执行接口中的方法
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("程序对Spring所做的BeanFactory的初始化没有改变...");
        System.out.println("Spring容器是：" + beanFactory);
    }


}
