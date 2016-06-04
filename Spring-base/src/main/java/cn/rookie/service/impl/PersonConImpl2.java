package cn.rookie.service.impl;

import cn.rookie.service.IAxeService;
import cn.rookie.service.IPersonConService;

import java.beans.PropertyEditor;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.service.impl
 * Description:
 */
public class PersonConImpl2 implements IPersonConService{

    private String name;
    private Integer age;
    private IAxeService axe;
    private String useName;

    public PersonConImpl2(String name, int age, IAxeService axe, String useName) {
        this.name = name;
        this.age = age;
        this.axe = axe;
        this.useName = useName;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop()+";name="+name+";age="+(age+1));
    }
}
