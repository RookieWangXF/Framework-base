package cn.rookie.aop_xml;

import cn.rookie.aop_anno.Aop;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop
 * Description:
 */
public class UserImpl implements IUser {

    @Override
    public void save() {
        System.out.println("---核心业务---");
    }
}
