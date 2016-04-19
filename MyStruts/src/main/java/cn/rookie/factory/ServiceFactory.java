package cn.rookie.factory;

import cn.rookie.service.IUserService;
import cn.rookie.service.impl.UserServiceImpl;

/**
 * Created by Rookie on 2016/4/19.
 */
public class ServiceFactory {
    public static IUserService getUserService() {
        return new UserServiceImpl();
    }
}
