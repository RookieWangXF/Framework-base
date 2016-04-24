package cn.rookie.service.impl;

import cn.rookie.dbc.DatabaseConnection;
import cn.rookie.factory.DAOFactory;
import cn.rookie.service.IDeptService;
import cn.rookie.vo.Dept;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/19.
 */
public class DeptServiceImpl implements IDeptService {
    private DatabaseConnection dbc = new DatabaseConnection();

    @Override
    public boolean insert(Dept vo) throws Exception {
        try {
            if (DAOFactory.getIDeptDaoInstance(this.dbc.getConnection()).findById(vo.getDeptno()) == null) {
                return DAOFactory.getIDeptDaoInstance(this.dbc.getConnection()).doCreate(vo);
            }
            return false;
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public boolean update(Dept vo) throws Exception {
        try {
            return DAOFactory.getIDeptDaoInstance(this.dbc.getConnection()).doUpdate(vo);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public boolean delete(Set<Integer> ids) throws Exception {
        try {
            return DAOFactory.getIDeptDaoInstance(this.dbc.getConnection()).doRemoveBatch(ids);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public List<Dept> list() throws Exception {
        try {
            return DAOFactory.getIDeptDaoInstance(this.dbc.getConnection()).findAll();
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public Dept get(int id) throws Exception {
        try {
            return DAOFactory.getIDeptDaoInstance(this.dbc.getConnection()).findById(id);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }
}
