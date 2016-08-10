package cn.rookie.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by Rookie on 2016/8/9.
 * Package_name is cn.rookie.bean.aware
 * Description: BeanFactoryAware 注入容器
 */
public class BeanFactoryAwareDemo implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    /**
     * 返回获取的容器
     *
     * @return
     */
    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

}
