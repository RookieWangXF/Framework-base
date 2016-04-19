package cn.rookie.action;

import cn.rookie.factory.ServiceFactory;
import cn.rookie.vo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Rookie on 2016/4/19.
 */
public class LoginAction {
    public Object login(HttpServletRequest req, HttpServletResponse response) throws Exception {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setPassword(password);

        Object uri = null;
        User userLogin = ServiceFactory.getUserService().login(user);
        if (userLogin == null) {
            uri = "LoginFailed";
        } else {
            uri = "LoginSuccess";
        }
        return uri;
    }
}
