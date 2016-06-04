package cn.rookie.bean;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.bean
 * Description:
 */
public class Axe {
    public Axe() {
        System.out.println("初始化了吧");
    }
    public String chop() {
        return "使用斧头砍柴";
    }

    static class InnerAxe{
        private String name;
    }
}
