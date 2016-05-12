package cn.rookie.framework.bean;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Rookie on 2016/5/12.
 * Package_name is cn.rookie.framework.bean
 * Description:用于加载bean的配置文件信息.
 */
public class BeanMappingManager {

    private Logger logger = Logger.getLogger(BeanMappingManager.class);

    private Map<String, BeanMapping> allBeans;

    public BeanMappingManager() {
        allBeans = new HashMap<String, BeanMapping>();
        this.init();
    }

    /**
     * 加载xml文件信息
     */
    private void init() {
        try {

            SAXReader reader = new SAXReader();
            InputStream inputStream = this.getClass().getResourceAsStream("beans.xml");
            logger.info("InputStream:" + inputStream);
            Document doc = reader.read(inputStream);

            Element root = doc.getRootElement();
            logger.info("root:" + root.getName());

            List<Element> beanList = root.elements("bean");
            logger.info("beanList:" + beanList.toString());

            for (Element ele_bean : beanList) {
                BeanMapping beanMapping = new BeanMapping();
                beanMapping.setIdStr(ele_bean.attributeValue("id"));
                beanMapping.setClassStr(ele_bean.attributeValue("class"));

                Map<String, PropertyMapping> propertys = new HashMap<String, PropertyMapping>();
                Iterator<Element> iter = ele_bean.elementIterator(); //默认所有的子标签都为property
                while (iter.hasNext()) {
                    Element ele_property = iter.next();
                    PropertyMapping propertyMapping = new PropertyMapping();
                    propertyMapping.setName(ele_property.attributeValue("name"));
                    if (ele_property.attributeValue("value") != null) {
                        propertyMapping.setValue(ele_property.attributeValue("value"));
                    }
                    if (ele_property.attributeValue("ref") != null) {
                        propertyMapping.setRef(ele_property.attributeValue("ref"));
                    }
                    propertys.put(propertyMapping.getName(), propertyMapping);
                }

                beanMapping.setPropertyMap(propertys);

                allBeans.put(beanMapping.getIdStr(), beanMapping);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 调用此方法获取加载的bean信息
     * @param beanName
     * @return
     */
    public BeanMapping getBeanMapping(String beanName) {
        if (beanName == null){
            throw new RuntimeException("传入参数不正确 ");
        }
        BeanMapping beanMapping = allBeans.get(beanName);
        if (beanMapping == null){
            throw new RuntimeException("配置文件有错误，找不到bean类");
        }
        return beanMapping;
    }

    public Map<String, BeanMapping> getAllBeans() {
        return allBeans;
    }
}
