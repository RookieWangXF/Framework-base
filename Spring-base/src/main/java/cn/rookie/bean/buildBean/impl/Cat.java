package cn.rookie.bean.buildBean.impl;

import cn.rookie.bean.buildBean.Being;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.factory.impl
 * Description:
 */
public class Cat implements Being {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void testBeing() {
        System.out.println(msg + "， 猫喜欢吃鱼");
    }
}
