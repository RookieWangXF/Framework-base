package cn.rookie.bean.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.bean
 * Description: 获取Bean类的id
 */
public class BeanIdAware implements BeanNameAware{
    /**
     * Spring容器会检测所有的Bean，如果发现有Bean实现了BeanNameAware，会调用set方法将beanName传给实现的方法。
     */
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void info() {
        System.out.println("此实现类的bean id 为" + beanName);
    }
}
