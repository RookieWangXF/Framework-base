package cn.rookie.post.bean;

import cn.rookie.bean.Axe;
import cn.rookie.service.IAxeService;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Rookie on 2016/4/25.
 * Description:
 * Project_name: Framework-base
 * Copyright (c) All Rights Reserved.
 */
public class Chinese implements InitializingBean{
    private IAxeService axe;

    private String name;

    public Chinese() {
        System.out.println("Spring实例化主调bean:Chinese实例...");
    }
    public IAxeService getAxe() {
        return axe;
    }

    public void setAxe(IAxeService axe) {
        this.axe = axe;
    }

    public String getName() {
        return name;
    }

    public void useAxe() {
        System.out.println(this.axe.chop());
    }
    public void setName(String name) {
        System.out.println("Spring执行setName...");
        this.name = name;
    }

    /**
     * 在Bean的全部依赖设置结束之后自动执行
     */
    public void init() {
        System.out.println("正在执行初始化方法 init()");
    }

    /**
     * 与init作用相同，只不过一个是默认使用init,这个是实现接口
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法 afterPropertiesSet()");
    }
}
