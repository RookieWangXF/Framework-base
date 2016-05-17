package cn.rookie.aop_anno;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop
 * Description:
 */
@Component
public class UserImpl implements IUser {

    @Resource
    private Aop aop;

    @Override
    public void save() {
        aop.begin();
        System.out.println("---核心业务---");
        aop.commit();
    }
}
