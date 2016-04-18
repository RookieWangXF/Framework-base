package cn.rookie.factory;

import cn.rookie.service.IEmpService;
import cn.rookie.service.impl.EmpServiceImpl;

/**
 * Created by Rookie on 2016/4/18.
 */
public class ServiceFactory {
    public static IEmpService getIEmpService() {
        return new EmpServiceImpl();
    }
}
