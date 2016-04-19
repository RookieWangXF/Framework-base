package cn.rookie.dao;

import cn.rookie.vo.User;

/**
 * Created by Rookie on 2016/4/19.
 */
public interface IUserDAO {
    /**
     * 登录，进行用户的判断
     * @param user
     * @return
     * @throws Exception
     */
    public User doLogin(User user);

    /**
     * 注册用户
     * @param user
     * @return
     * @throws Exception
     */
    public void doRegister(User user);
}
