package cn.rookie.service;

import cn.rookie.bean.Employee;
import cn.rookie.dao.EmployeeDao;
import org.apache.log4j.Logger;

import java.io.Serializable;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.service
 * Description:
 */
public class EmployeeService {
    private Logger logger = Logger.getLogger(EmployeeService.class);
    // IOC注入
    private EmployeeDao employeeDao;
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    /**
     * 查询
     * @param id
     */
    public Employee findById(int id) {
        Employee emp = employeeDao.findById(id);
        logger.info("[emp]" + emp);
        return emp;
    }
}
