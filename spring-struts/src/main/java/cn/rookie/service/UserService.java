package cn.rookie.service;

import cn.rookie.dao.UserDao;

/**
 * Created by Rookie on 2016/5/16.
 * Package_name is cn.rookie.service
 * Description:
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
