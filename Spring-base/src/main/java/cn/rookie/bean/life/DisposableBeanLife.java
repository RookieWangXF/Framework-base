package cn.rookie.bean.life;

import cn.rookie.bean.IAxe;
import org.springframework.beans.factory.DisposableBean;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.life
 * Description:当bean实例销毁的时候调用
 */
public class DisposableBeanLife implements DisposableBean {

    private IAxe axe;

    private String name;

    public DisposableBeanLife() {
        System.out.println("----Spring实例化主调bean:Chinese实例...");
    }
    public IAxe getAxe() {
        return axe;
    }

    public void setAxe(IAxe axe) {
        System.out.println("----Spring执行set方法...");
        this.axe = axe;
    }

    public String getName() {
        return name;
    }

    public void useAxe() {
        System.out.println(this.axe.chop());
    }
    public void setName(String name) {
        System.out.println("----Spring执行setName...");
        this.name = name;
    }

    /**
     * 在Bean的全部依赖设置结束之后自动执行
     */
    public void close() {
        System.out.println("---正在执行销毁方法 close()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("---正在执行销毁方法 destroy()");
    }
}
