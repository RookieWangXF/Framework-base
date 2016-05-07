package cn.rookie.hello.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Rookie on 2016/5/7.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class MovieAction extends ActionSupport {
    private static final Logger log = LogManager.getLogger(MovieAction.class.getName());
    private static final long serialVersionUID = 1L;

    private String id;

    public String view() {
        log.debug("Value of id is " + id);
        return SUCCESS;
    }

    public String index() {
        log.debug("Value of id is " + id);
        return SUCCESS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
