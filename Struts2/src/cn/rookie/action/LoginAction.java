package cn.rookie.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.net.URLEncoder;

/**
 * Created by Rookie on 2016/4/21.
 * 1. 要处理的类需要继承自ActionSupport
 */
public class LoginAction extends ActionSupport{

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String login() throws Exception {
        this.username = URLEncoder.encode("我爱蕾蕾", "UTF-8");
        if (getUsername().equals("fei") && getPassword().equals("123")) {
            return SUCCESS;
        }

        return SUCCESS;
    }

    public String regist() throws Exception{
        ActionContext.getContext().getSession().put("user",getUsername());
        return SUCCESS;
    }



}
