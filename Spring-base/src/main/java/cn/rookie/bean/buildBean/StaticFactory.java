package cn.rookie.bean.buildBean;

import cn.rookie.bean.buildBean.impl.Cat;
import cn.rookie.bean.buildBean.impl.Dog;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.factory
 * Description:
 */
public class StaticFactory {

    public static Being getBeing(String arg) {
        if (arg.equalsIgnoreCase("dog")) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
