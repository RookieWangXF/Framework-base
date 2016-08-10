package cn.rookie.annotation.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by Rookie on 2016/4/25.
 * Package name is cn.rookie.annotation.bean
 * Description:
 */
@Component("personAnnoConfigvalue")
public class PersonAnnoConfig {

    private IAxe axe;

    @Resource(name = "steelAxe")
    public void setAxe(IAxe axe) {
        this.axe = axe;
    }

    public void say() {
        System.out.println("我是personAnnoConfigvalue"+ axe.chop());
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
