package cn.rookie.dao;

import cn.rookie.bean.Dept;
import cn.rookie.bean.Employee;
import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.dao
 * Description:
 */
public class EmployeeDao {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * 查询
     * @param id
     */
    public Employee findById(int id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}
