package cn.rookie.bean.buildBean.impl;

import cn.rookie.bean.buildBean.User;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.factory.impl
 * Description:
 */
public class UserUsa implements User{

    @Override
    public String sayHello(String name) {
        return name + "hello";
    }

    @Override
    public String sayGoodBye(String name) {
        return name + "bye bye";
    }

}
