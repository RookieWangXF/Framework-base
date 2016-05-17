package cn.rookie.action;

import cn.rookie.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rookie on 2016/5/16.
 * Package_name is cn.rookie.action
 * Description:
 */
public class UserAction extends ActionSupport {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute() {
        userService.save();
        return SUCCESS;
    }
}
