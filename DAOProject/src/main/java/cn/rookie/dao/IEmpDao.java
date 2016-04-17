package cn.rookie.dao;

import vo.Emp;

import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public interface IEmpDao {
    public boolean doCreate(Emp vo);

    public boolean doUpdate(Emp vo);

    public Emp findById(Integer id);

    public boolean doRemovebatch(Set<Integer> ids);

    public List<Emp> findAll();

    public Integer getAllCount(String column, String keyWord);
}
