package cn.rookie.factory;

import cn.rookie.dao.IUserDAO;
import cn.rookie.dao.impl.UserDAOImpl;

/**
 * Created by Rookie on 2016/4/19.
 */
public class DAOFactory {
    public static IUserDAO getUserDAOInstance() {
        return new UserDAOImpl();
    }
}
