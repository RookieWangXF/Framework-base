package cn.rookie.bean;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.service.impl
 * Description:
 */

public class StoneAxe implements IAxe {
    @Override
    public String chop() {
        return "使用石斧砍柴";
    }

    @Override
    public String toString() {
        return chop();
    }
}
