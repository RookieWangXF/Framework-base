package cn.rookie;

import cn.rookie.factory.ServiceFactory;
import cn.rookie.vo.Dept;
import cn.rookie.vo.Emp;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/23.
 * Package name is cn.rookie
 * Description:
 */
public class TestDept {
    @Test
    public void testInsert() {
        for (int i = 1; i < 100; i++) {
            Dept vo = new Dept();
            vo.setDeptno(i);
            vo.setDname("feifei" + i);
            vo.setLoc("Peking");
            try {
                System.out.println(ServiceFactory.getIDeptService().insert(vo));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void testUpdate() {
        for (int i = 1; i < 100; i++) {
            Dept vo = new Dept();
            vo.setDeptno(i);
            vo.setDname("leilei" + i);
            vo.setLoc("Peking");
            try {
                System.out.println(ServiceFactory.getIDeptService().update(vo));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testRemove() {
        Set<Integer> ids = new HashSet<>();
        for (int i = 1;i<100;i++) {
            ids.add(i);
        }
        try {
            System.out.println(ServiceFactory.getIDeptService().delete(ids));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGetById() {
        try {
            Dept vo = ServiceFactory.getIDeptService().get(1);
            System.out.println(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testList() {
        try {
            List<Dept> list = ServiceFactory.getIDeptService().list();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
