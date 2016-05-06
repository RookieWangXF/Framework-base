package cn.rookie.edit.sercive.impl;

import cn.rookie.edit.sercive.CarModelsService;

/**
 * Created by Rookie on 2016/5/6.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class CarModelsServiceImpl implements CarModelsService{

    @Override
    public String[] getCarModels() {
        String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};

        return carModelsAvailable;
    }
}
