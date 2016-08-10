package cn.rookie.bean.dependent;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.dependent
 * Description:
 */
public class SetValue {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void info() {
        System.out.println(name);
    }
}
