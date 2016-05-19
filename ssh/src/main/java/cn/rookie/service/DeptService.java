package cn.rookie.service;

import cn.rookie.bean.Dept;
import cn.rookie.dao.DeptDao;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.service
 * Description:
 */
public class DeptService {
    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;

    }

    public void save(Dept dept) {
        deptDao.save(dept);
    }
}
