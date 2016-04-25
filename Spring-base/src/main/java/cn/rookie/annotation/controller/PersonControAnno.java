package cn.rookie.annotation.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by Rookie on 2016/4/25.
 * Package name is cn.rookie.annotation.controller
 * Description:
 */
@Controller
public class PersonControAnno {

    public void say() {
        System.out.println("ControAnno");
    }
}
