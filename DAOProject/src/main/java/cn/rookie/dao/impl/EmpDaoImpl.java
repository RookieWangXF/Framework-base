package cn.rookie.dao.impl;

import dao.IEmpDao;
import vo.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public class EmpDaoImpl implements IEmpDao {

    private Connection conn;
    private PreparedStatement pstmt;

    public EmpDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean doCreate(Emp vo) {
        String sql = "";



        return false;
    }

    @Override
    public boolean doUpdate(Emp vo) {
        return false;
    }

    @Override
    public Emp findById(Integer id) {
        return null;
    }

    @Override
    public boolean doRemovebatch(Set<Integer> ids) {
        return false;
    }

    @Override
    public List<Emp> findAll() {
        return null;
    }

    @Override
    public Integer getAllCount(String column, String keyWord) {
        return null;
    }
}
