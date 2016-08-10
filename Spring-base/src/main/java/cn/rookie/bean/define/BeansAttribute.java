package cn.rookie.bean.define;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.define
 * Description:Beans的所有属性
 */
public class BeansAttribute {
    /**
     * beans是所有元素的根元素，可以指配如下属性
     */

    private BeanAttribute beanAttribute;

    public void setBeanAttribute(BeanAttribute beanAttribute) {
        this.beanAttribute = beanAttribute;
    }

    public void sayInfo() {
        beanAttribute.info();
    }
}
