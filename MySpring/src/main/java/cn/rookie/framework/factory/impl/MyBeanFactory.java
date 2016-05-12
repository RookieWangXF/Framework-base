package cn.rookie.framework.factory.impl;

import cn.rookie.framework.bean.BeanMapping;
import cn.rookie.framework.bean.BeanMappingManager;
import cn.rookie.framework.bean.PropertyMapping;
import cn.rookie.framework.factory.IBeanFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rookie on 2016/5/12.
 * Package_name is cn.rookie.framework.factory.impl
 * Description:
 */
public class MyBeanFactory implements IBeanFactory {

    private Map<String, Object> beans;
    private BeanMappingManager manager;

    public MyBeanFactory() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        manager = new BeanMappingManager();
        beans = new HashMap<String, Object>();
        init();
    }

    /**
     * 讲加载的xml文件转化为相对应的类，并进行注入
     */
    private void init() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        /**
         * 1. 循环allBeans这个map
         * 2. 依次解析其中的内容
         * 3.
         */
        Map<String, BeanMapping> allBeans = manager.getAllBeans();
        Set<Map.Entry<String,BeanMapping>> beanSet = allBeans.entrySet();
        Iterator iter = beanSet.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, BeanMapping> entry = (Map.Entry<String, BeanMapping>) iter.next();
            String idStr = entry.getKey();
            BeanMapping beanMapping = entry.getValue();
            if (!beans.containsKey(idStr)) {
                String classStr = beanMapping.getClassStr();
                Class clazz = Class.forName(classStr);
                Object obj = clazz.newInstance();

                //当需要注入值的时候
                Map<String, PropertyMapping> propertys = beanMapping.getPropertyMap();
                Set<Map.Entry<String,PropertyMapping>> propertySet = propertys.entrySet();
                Iterator iter2 = propertySet.iterator();
                while (iter2.hasNext()) {
                    Map.Entry<String, PropertyMapping> entry2 = (Map.Entry<String, PropertyMapping>) iter2.next();
                    String name = entry2.getKey();
                    PropertyMapping property = entry2.getValue();

                }
                beans.put(idStr, obj);
            }

        }
    }





    @Override
    public Object getBean(String idStr) {
        return beans.get(idStr);
    }

    @Override
    public <T> T getBean(String idStr, Class<T> requireType) {
        return null;
    }

    @Override
    public boolean isContain(String idStr) {
        return beans.containsKey(idStr);
    }
}
