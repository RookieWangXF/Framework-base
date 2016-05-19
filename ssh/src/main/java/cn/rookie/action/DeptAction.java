package cn.rookie.action;

import cn.rookie.bean.Dept;
import cn.rookie.bean.Employee;
import cn.rookie.service.DeptService;
import cn.rookie.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.action
 * Description:
 */
public class DeptAction extends ActionSupport {

    private DeptService deptService;

    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }

    public String save() {
        Dept dept = new Dept();
        dept.setId(2);
        dept.setName("huahuadv");
        deptService.save(dept);
        return SUCCESS;
    }
}
