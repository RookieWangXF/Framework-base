package cn.rookie.vo;

import java.io.Serializable;

/**
 * Created by Rookie on 2016/4/19.
 */
public class User implements Serializable {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "姓名："+getName()+" ,密码是："+getPassword();
    }
}
