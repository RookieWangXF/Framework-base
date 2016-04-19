package cn.rookie.framework.bean;

import java.util.Map;

/**
 * Created by Rookie on 2016/4/19.
 * 此类用来封装Action节点的信息，即配置文件中的内容
 */
public class ActionMapping {
    /**
     * actionName   要处理的action的名称，即从uri中截取的
     * className    要处理此action的类的名称
     * methodName   类中具体方法的名称
     */
    private String actionName;
    private String className;
    private String methodName;

    private Map<String,Result> results;


    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Map<String, Result> getResults() {
        return results;
    }

    public void setResults(Map<String, Result> results) {
        this.results = results;
    }
}
