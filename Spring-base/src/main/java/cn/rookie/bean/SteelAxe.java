package cn.rookie.bean;


/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.service.impl
 * Description:
 */
public class SteelAxe implements IAxe{
    @Override
    public String chop() {
        return "使用钢斧砍柴";
    }
    @Override
    public String toString() {
        return chop();
    }
}
