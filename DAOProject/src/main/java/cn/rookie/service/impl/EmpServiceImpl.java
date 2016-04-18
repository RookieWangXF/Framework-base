package cn.rookie.service.impl;

import cn.rookie.dbc.DatabaseConnection;
import cn.rookie.factory.DAOFactory;
import cn.rookie.service.IEmpService;
import cn.rookie.vo.Emp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/13.
 * Description:提供一个数据库连接类的实例化对象
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public class EmpServiceImpl implements IEmpService {


    private DatabaseConnection dbc = new DatabaseConnection();

    public boolean insert(Emp vo) throws Exception {
        try {
            if (DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).findById(vo.getEmpno()) == null) {
                return DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).doCreate(vo);
            }
            return false;
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    public boolean update(Emp vo) throws Exception {
        try {
            return DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).doUpdate(vo);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    public boolean delete(Set<Integer> ids) throws Exception {
        try {
            return DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).doRemoveBatch(ids);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    public Emp get(int id) throws Exception {
        try {
            return DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).findById(id);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    public List<Emp> list() throws Exception {
        try {
            return DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).findAll();
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    public Map<String, Object> list(int currentPage, int lineSize, String column, String keyWord) throws Exception {
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("allEmps", DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).findAllSplit(currentPage, lineSize, column, keyWord));
            map.put("empCount", DAOFactory.getIEmpDaoInstance(this.dbc.getConnection()).getAllCount(column, keyWord));
            return map;
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }

    }
}
