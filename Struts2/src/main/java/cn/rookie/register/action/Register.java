package cn.rookie.register.action;

import cn.rookie.register.model.Person;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class Register extends ActionSupport {
    private static final long serialVersionUID = 1L;

    private Person personBean;

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    @Override
    public String execute() throws Exception {
        validate();
        return super.execute();
    }

    /**
     * 并没有什么卵用
     */
    public void validate(){

        if ( personBean.getName().length() == 0 ){

            addFieldError( "personBean.name", " name is required." );

        }


        if ( personBean.getEmail().length() == 0 ){

            addFieldError( "personBean.email", "Email is required." );

        }

        if ( personBean.getAge() < 18 ){

            addFieldError( "personBean.age", "Age is required and must be 18 or older" );

        }


    }
}
