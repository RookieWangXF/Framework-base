package cn.rookie.factory.impl;

import cn.rookie.factory.User;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.factory.impl
 * Description:
 */
public class CnUser implements User {
    @Override
    public String sayHello(String name) {
        return name + "你好";
    }

    @Override
    public String sayGoodBye(String name) {
        return name + "再见";
    }
}
