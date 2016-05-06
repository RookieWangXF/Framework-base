package cn.rookie.edit.sercive.impl;

import cn.rookie.edit.model.Person;
import cn.rookie.edit.sercive.EditService;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class EditServiceImpl implements EditService{

    private static Person person;
    private static String [] carModels = {"Ford","Nissan"};

    static {

        person = new Person();
        person.setFirstName("Rookie");
        person.setLastName("Wang");
        person.setEmail("bphillips@ku.edu");
        person.setSport("basketball");
        person.setGender("Boy");
        person.setResidency("KS");
        person.setOver21(true);
        person.setCarModels( carModels);

    }
    @Override
    public Person getPerson() {
        return EditServiceImpl.person;
    }

    @Override
    public void savePerson(Person personBean) {
        EditServiceImpl.person.setFirstName(personBean.getFirstName() );
        EditServiceImpl.person.setLastName(personBean.getLastName() );
        EditServiceImpl.person.setSport(personBean.getSport() );
        EditServiceImpl.person.setGender( personBean.getGender() );
        EditServiceImpl.person.setResidency( personBean.getResidency() );
        EditServiceImpl.person.setOver21( personBean.isOver21() );
        EditServiceImpl.person.setCarModels(personBean.getCarModels() );
    }
}
