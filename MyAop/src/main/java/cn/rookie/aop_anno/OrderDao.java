package cn.rookie.aop_anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.myaop
 * Description:
 */
@Component
@Scope("prototype")
public class OrderDao {

    public void save() {
        System.out.println("---核心业务---");
    }
}
