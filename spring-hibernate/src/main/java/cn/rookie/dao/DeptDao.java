package cn.rookie.dao;

import cn.rookie.bean.Dept;
import org.hibernate.SessionFactory;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.dao
 * Description:
 */
public class DeptDao {

    // Spring与Hibernate整合： IOC容器注入
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void save(Dept dept) {
        sessionFactory.getCurrentSession().save(dept);
    }

    public void update(Dept dept) {
        sessionFactory.getCurrentSession().update(dept);
    }
}
