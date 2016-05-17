package cn.rookie.aop_xml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop
 * Description:
 */

public class OrderDao {

    public void save() {
        System.out.println("---核心业务---");
    }
}
