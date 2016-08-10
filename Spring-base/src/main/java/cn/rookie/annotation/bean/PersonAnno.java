package cn.rookie.annotation.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by Rookie on 2016/4/25.
 * Package name is cn.rookie.annotation.bean
 * Description: 将此类注入到容器中
 */
@Scope("singleton")
@Component
public class PersonAnno {

    private IAxe axe;

    /**
     * 注入属性
     * @param axe
     */
    @Resource(name = "steelAxe")
    public void setAxe(IAxe axe) {
        this.axe = axe;
    }

    public void say() {
        System.out.println("我是PersonAnno"+axe.chop());
    }

    @PostConstruct
    public void init() {
        System.out.println("正在执行init方法");
    }
    @PreDestroy
    public void close() {
        System.out.println("正在执行close方法");
    }
}
