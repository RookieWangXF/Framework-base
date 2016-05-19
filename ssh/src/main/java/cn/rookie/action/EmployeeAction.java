package cn.rookie.action;

import cn.rookie.bean.Employee;
import cn.rookie.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.action
 * Description:
 */
public class EmployeeAction extends ActionSupport {

    private EmployeeService employeeService;

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public String execute() throws Exception {
        int empid = 1;
        Employee employee = employeeService.findById(empid);
        Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
        request.put("emp", employee);
        return super.execute();
    }
}
