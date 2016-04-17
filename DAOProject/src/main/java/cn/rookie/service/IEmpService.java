package cn.rookie.service;


import cn.rookie.vo.Emp;

import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public interface IEmpService {
    public boolean insert(Emp vo);

    public boolean update(Emp vo);

    public boolean delete(Set<Integer> ids);

    public Emp get(Integer id);

    public List<Emp> list();
}
