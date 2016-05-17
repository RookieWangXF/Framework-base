package cn.rookie.tx.anno;

import cn.rookie.tx.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.tx.anno
 * Description:
 */
@Service
public class DeptService {

    @Resource
    private DeptDao deptDao;
    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }


    @Transactional(
            readOnly = false,  // 读写事务
            timeout = -1,       // 事务的超时时间不限制
            //noRollbackFor = ArithmeticException.class,  // 遇到数学异常不回滚
            isolation = Isolation.DEFAULT,              // 事务的隔离级别，数据库的默认
            propagation = Propagation.REQUIRED			// 事务的传播行为
    )  //增肌事务控制
    public void save(Dept dept){
        // 第一次调用
        deptDao.save(dept);
        int i = 1/0; // 异常： 整个Service.save()执行成功的要回滚

        // 第二次调用
        deptDao.save(dept);
    }
}
