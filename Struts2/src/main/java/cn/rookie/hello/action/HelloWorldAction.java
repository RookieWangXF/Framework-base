package cn.rookie.hello.action;

import cn.rookie.hello.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class HelloWorldAction extends ActionSupport{
    private static Logger logger = Logger.getLogger(HelloWorldAction.class);

    private static final long serialVersionUID = 1L;

    private MessageStore messageStore;

    private String name;

    public MessageStore getMessageStore() {
        return messageStore;
    }

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore();
        setName("Rookie");
        logger.info("name : " + getName());
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
}
