package cn.rookie.factory;

import cn.rookie.factory.impl.CnUser;
import cn.rookie.factory.impl.USAUser;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.factory
 * Description: 实例工厂方法
 */
public class UserFactory {
    public User getUser(String ethnic) {
        if (ethnic.equalsIgnoreCase("chin")) {
            return new CnUser();
        } else {
            return new USAUser();
        }
    }
}
