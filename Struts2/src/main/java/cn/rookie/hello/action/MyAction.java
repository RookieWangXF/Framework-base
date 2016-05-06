package cn.rookie.hello.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rookie on 2016/5/5.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class MyAction extends ActionSupport {
    private String target;

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    @Override
    public String execute() throws Exception {
        //System.out.println("已经成功转向" + target);
        return super.execute();
    }
}
