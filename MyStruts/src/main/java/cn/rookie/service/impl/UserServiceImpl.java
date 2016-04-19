package cn.rookie.service.impl;

import cn.rookie.factory.DAOFactory;
import cn.rookie.service.IUserService;
import cn.rookie.vo.User;

/**
 * Created by Rookie on 2016/4/19.
 */
public class UserServiceImpl implements IUserService{
    @Override
    public User login(User user) {
        return DAOFactory.getUserDAOInstance().doLogin(user);
    }

    @Override
    public void register(User user) {
        DAOFactory.getUserDAOInstance().doRegister(user);
    }
}
