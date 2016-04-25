package cn.rookie.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Rookie on 2016/4/25.
 * Package name is cn.rookie.annotation
 * Description:
 */
@Repository
public class PersonDaoAnno {

    public void say() {
        System.out.println("PersonDaoAnno");
    }
}
