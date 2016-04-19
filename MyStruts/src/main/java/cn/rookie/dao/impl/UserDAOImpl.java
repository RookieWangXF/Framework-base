package cn.rookie.dao.impl;

import cn.rookie.dao.IUserDAO;
import cn.rookie.vo.User;

/**
 * Created by Rookie on 2016/4/19.
 */
public class UserDAOImpl implements IUserDAO{


    @Override
    public User doLogin(User user){
        if ("fei".equals(user.getName()) && "123".equals(user.getPassword())) {
            return user;
        }
        return null;
    }

    @Override
    public void doRegister(User user){
        System.out.println("注册成功，用户名是："+user.getName());
    }
}
