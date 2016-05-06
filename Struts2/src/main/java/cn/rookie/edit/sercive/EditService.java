package cn.rookie.edit.sercive;

import cn.rookie.edit.model.Person;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public interface EditService {

    public Person getPerson();

    public void savePerson(Person person);
}
