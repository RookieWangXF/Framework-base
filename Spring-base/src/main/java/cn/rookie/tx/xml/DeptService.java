package cn.rookie.tx.xml;

import cn.rookie.tx.Dept;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.tx.anno
 * Description:
 */
public class DeptService {

    // 容器注入dao对象
    private DeptDao deptDao;
    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    /*
     * 事务控制？
     */
    public void save(Dept dept){
        // 第一次调用
        deptDao.save(dept);

        int i = 1/0; // 异常： 整个Service.save()执行成功的要回滚

        // 第二次调用
        deptDao.save(dept);
    }
}
