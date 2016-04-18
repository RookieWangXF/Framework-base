package cn.rookie;

import cn.rookie.factory.ServiceFactory;
import cn.rookie.vo.Emp;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Rookie on 2016/4/18.
 */
public class TestEmp {

    @Test
    public void testInsert() {
        Emp vo = new Emp();
        vo.setEmpno(3);
        vo.setEname("fei");
        vo.setJob("teacher");
        vo.setHiredate(new Date());
        vo.setSal(12.2);
        vo.setComm(0.2);
        try {
            System.out.println(ServiceFactory.getIEmpService().insert(vo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
