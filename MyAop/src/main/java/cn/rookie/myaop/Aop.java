package cn.rookie.myaop;

import org.springframework.stereotype.Component;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop
 * Description:
 */
@Component
public class Aop {

    public void begin() {
        System.out.println("开启事务/异常");
    }
    public void commit() {
        System.out.println("提交事务、关闭");
    }
}
