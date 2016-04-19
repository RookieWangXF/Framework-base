package cn.rookie.factory;

import cn.rookie.service.IDeptService;
import cn.rookie.service.IEmpService;
import cn.rookie.service.impl.DeptServiceImpl;
import cn.rookie.service.impl.EmpServiceImpl;

/**
 * Created by Rookie on 2016/4/18.
 */
public class ServiceFactory {
    public static IEmpService getIEmpService() {
        return new EmpServiceImpl();
    }

    public static IDeptService getIDeptService() {
        return new DeptServiceImpl();
    }
}
