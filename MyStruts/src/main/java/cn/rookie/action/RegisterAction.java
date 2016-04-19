package cn.rookie.action;

import cn.rookie.factory.ServiceFactory;
import cn.rookie.vo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Rookie on 2016/4/19.
 */
public class RegisterAction {

    public Object register(HttpServletRequest req,HttpServletResponse resq) throws Exception {
        Object uri = null;
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setPassword(password);

        ServiceFactory.getUserService().register(user);
        uri = "registerSuccess";
        return uri;
    }
}
