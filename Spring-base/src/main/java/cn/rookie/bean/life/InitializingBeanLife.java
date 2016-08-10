package cn.rookie.bean.life;

import cn.rookie.bean.IAxe;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.life
 * Description:两种方式实现依赖配置完成后执行
 */
public class InitializingBeanLife implements InitializingBean{
    private IAxe axe;

    private String name;

    public InitializingBeanLife() {
        System.out.println("InitializingBeanLife----Spring实例化主调bean:Chinese实例...");
    }
    public IAxe getAxe() {
        return axe;
    }

    public void setAxe(IAxe axe) {
        System.out.println("InitializingBeanLife----Spring执行set方法...");
        this.axe = axe;
    }

    public String getName() {
        return name;
    }

    public void useAxe() {
        System.out.println(this.axe.chop());
    }
    public void setName(String name) {
        System.out.println("InitializingBeanLife----Spring执行setName...");
        this.name = name;
    }

    /**
     * 在Bean的全部依赖设置结束之后自动执行
     */
    public void init() {
        System.out.println("InitializingBeanLife正在执行初始化方法 init()");
    }

    /**
     * 与init作用相同，只不过一个是默认使用init,这个是实现接口
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBeanLife正在执行初始化方法 afterPropertiesSet()");
    }
}
