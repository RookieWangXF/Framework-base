package cn.rookie.bean.dependent;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.dependent
 * Description:
 */
public class ConstructorValue {
    private String name;
    private String value;

    public ConstructorValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void info() {
        System.out.println(name + " : " + value);
    }
}
