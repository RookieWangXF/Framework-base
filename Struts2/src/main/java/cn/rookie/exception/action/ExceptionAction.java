package cn.rookie.exception.action;

import cn.rookie.exception.model.SecurityBreachException;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class ExceptionAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public String throwException() throws Exception {
        throw new Exception("Exception thrown from throwException");
    }

    public String throwNullPointerException() {
        throw new NullPointerException("Null Pointer Exception thrown from "
                + ExceptionAction.class.toString());
    }

    public String throwSecurityException() throws SecurityBreachException {
        throw new SecurityBreachException("Security breach exception thrown from throwSecurityException");
    }

}
