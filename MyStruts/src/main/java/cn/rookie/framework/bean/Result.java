package cn.rookie.framework.bean;

/**
 * Created by Rookie on 2016/4/19.
 * 封装结果视图，返回的结果也是有不同的参数的
 * name 跳转的结果标记，success等
 * type 跳转的类型，默认是转发
 * page 跳转的页面。Xxx.jsp
 */
public class Result {

    private String name;
    private String type;
    private String page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
