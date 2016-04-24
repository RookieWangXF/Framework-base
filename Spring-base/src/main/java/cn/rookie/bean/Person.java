package cn.rookie.bean;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.bean
 * Description:
 */
public class Person {
    private Axe axe;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void useAxe() {
        System.out.println(this.name);
        System.out.println(axe.chop());
    }
}
