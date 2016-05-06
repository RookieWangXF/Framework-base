package cn.rookie.exception.model;

/**
 * Created by Rookie on 2016/5/6.
 * Description: 自定义一个Exception
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class SecurityBreachException extends Exception {

    private static final long serialVersionUID = -1232121594261703341L;

    public SecurityBreachException() {

        super("Security Exception");


    }

    public SecurityBreachException(String message) {

        super(message);
    }
}
