package cn.rookie.factory;

import cn.rookie.dao.IDeptDAO;
import cn.rookie.dao.IEmpDao;
import cn.rookie.dao.impl.DeptDaoImpl;
import cn.rookie.dao.impl.EmpDaoImpl;

import java.sql.Connection;

/**
 * Created by Rookie on 2016/4/17.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class DAOFactory {

    public static IEmpDao getIEmpDaoInstance(Connection conn) {
        return new EmpDaoImpl(conn);
    }

    public static IDeptDAO getIDeptDaoInstance(Connection conn) {
        return new DeptDaoImpl(conn);
    }
}

