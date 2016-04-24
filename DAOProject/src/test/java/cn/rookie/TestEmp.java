package cn.rookie;

import cn.rookie.factory.ServiceFactory;
import cn.rookie.vo.Emp;
import org.junit.Test;

import java.util.*;

/**
 * Created by Rookie on 2016/4/18.
 */
public class TestEmp {

    @Test
    public void testInsert() {
        for (int i = 1; i < 100; i++) {
            Emp vo = new Emp();
            vo.setEmpno(i);
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

    @Test
    public void testUpdate() {
        for (int i = 1; i < 100; i++) {
            Emp vo = new Emp();
            vo.setEmpno(i);
            vo.setEname("asd");
            vo.setJob("teacher");
            vo.setHiredate(new Date());
            vo.setSal(12.2);
            vo.setComm(0.2);
            try {
                System.out.println(ServiceFactory.getIEmpService().update(vo));
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
            System.out.println(ServiceFactory.getIEmpService().delete(ids));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testGetById() {
        try {
            Emp emp = ServiceFactory.getIEmpService().get(1);
            System.out.println(emp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testListAll() {
        try {
            List<Emp> list = ServiceFactory.getIEmpService().list();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAllCount() {
        try {
            int i  = ServiceFactory.getIEmpService().getAllCount("ename","fei");
            System.out.println(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testListAllSplit() {
        try {
            int currentPage;
            int lineSize = 5;
            String column ="ename";
            String keyWord = "fei";
            int totalCount = ServiceFactory.getIEmpService().getAllCount(column, keyWord);
            for (int i = 0; i < (totalCount / lineSize); i++) {
                currentPage = i;
                List<Emp> list = ServiceFactory.getIEmpService().findAllSplit(currentPage, lineSize, "ename", "fei");
                System.out.println("这是第" + (i+1) + "页！");
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(list.get(j));
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
