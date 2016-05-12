package cn.rookie.framework.bean;

import java.util.Map;

/**
 * Created by Rookie on 2016/5/12.
 * Package_name is cn.rookie.framework.bean
 * Description:用于存储bean标签内的元素
 */
public class BeanMapping {

    //每一个bean的唯一id
    private String idStr;

    //每一个bean的唯一类，不可以是接口
    private String classStr;

    private Map<String, PropertyMapping> propertys;

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getClassStr() {
        return classStr;
    }

    public void setClassStr(String classStr) {
        this.classStr = classStr;
    }

    public Map<String, PropertyMapping> getPropertyMap() {
        return propertys;
    }

    public void setPropertyMap(Map<String, PropertyMapping> propertys) {
        this.propertys = propertys;
    }
}
