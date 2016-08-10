package cn.rookie.bean.life;

import cn.rookie.post.bean.Chinese;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Rookie on 2016/4/25.
 * Description: Bean后处理器
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class BeanPostProcessorLife implements BeanPostProcessor {

    /**
     * 对容器中的Bean实例进行后处理,注意是所有的实例
     * @param bean 需要进行后处理的原Bean实例
     * @param beanName 需要进行后处理的Bean类的配置id
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之前对" + beanName + "进行增强型处理");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之后对" + beanName + "进行增强型处理");

        if (bean instanceof InitializingBeanLife) {
            InitializingBeanLife life = (InitializingBeanLife) bean;
            life.setName("后处理器更改了名称");
            System.out.println("postProcessAfterInitialization");
        }
        return bean;
    }
}
