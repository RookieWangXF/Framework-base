package cn.rookie.bean.define;

/**
 * Created by Rookie on 2016/8/9.
 * Package_name is cn.rookie.bean.define
 * Description:介绍Bean的属性
 */
public class BeanAttribute {

    /**
     * bean的属性和beans其实是一样的，只不过作用域有区别，bean只针对特定的bean,会覆盖beans的设值
     */
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        System.out.println(name);
        return name;
    }
}
