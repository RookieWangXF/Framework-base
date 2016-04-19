package cn.rookie.service;

import cn.rookie.vo.User;

/**
 * Created by Rookie on 2016/4/19.
 */
public interface IUserService {
    public User login(User user);

    public void register(User user);
}
