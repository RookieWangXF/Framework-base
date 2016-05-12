package cn.rookie.bean;

/**
 * Created by Rookie on 2016/5/12.
 * Package_name is cn.rookie.bean
 * Description:
 */
public class Chinese implements Person {
    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public Axe getAxe() {
        return axe;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }
}
