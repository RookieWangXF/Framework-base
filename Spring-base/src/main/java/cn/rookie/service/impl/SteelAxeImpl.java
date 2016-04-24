package cn.rookie.service.impl;

import cn.rookie.service.IAxeService;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.service.impl
 * Description:
 */
public class SteelAxeImpl implements IAxeService{
    @Override
    public String chop() {
        return "使用钢斧砍柴";
    }
}
