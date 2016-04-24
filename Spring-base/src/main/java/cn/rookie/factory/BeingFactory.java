package cn.rookie.factory;

import cn.rookie.factory.impl.Cat;
import cn.rookie.factory.impl.Dog;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.factory
 * Description:
 */
public class BeingFactory {

    public static Being getBeing(String arg) {
        if (arg.equalsIgnoreCase("dog")) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
