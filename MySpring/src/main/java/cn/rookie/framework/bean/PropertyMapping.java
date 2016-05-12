package cn.rookie.framework.bean;

/**
 * Created by Rookie on 2016/5/12.
 * Package_name is cn.rookie.framework.bean
 * Description:采用设值注入的方式
 */
public class PropertyMapping {

    private String name;

    private String ref;

    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
