package cn.rookie.annotation.service;

import org.springframework.stereotype.Service;

/**
 * Created by Rookie on 2016/4/25.
 * Package name is cn.rookie.annotation.service
 * Description:
 */

@Service
public class PersonServiceAnno {

    public void say() {
        System.out.println("PersonServiceAnno");
    }
}
