package cn.rookie.bean.buildBean;


import cn.rookie.bean.buildBean.impl.UserCn;
import cn.rookie.bean.buildBean.impl.UserUsa;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.factory
 * Description: 实例工厂方法
 */
public class InstancFactory {

    public User getUser(String ethnic) {
        if (ethnic.equalsIgnoreCase("chinese")) {
            return new UserCn();
        } else {
            return new UserUsa();
        }
    }
}
