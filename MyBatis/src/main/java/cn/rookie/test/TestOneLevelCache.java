package cn.rookie.test;

import cn.rookie.bean.User;
import cn.rookie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by 201601120071 on 2016/1/16.
 */
public class TestOneLevelCache {
    private SqlSession session;
    @Test
    public void testCache(){
        session = MyBatisUtil.getSqlSession(true);
        String statement ="cn.rookie.bean.userMapper.getUser";
        User user = session.selectOne(statement, 5);
        System.out.println(user);

        /**
         * 一级缓存就会默认被使用,当session被关闭的时候就不可能用了
         * 在没有关闭的时候都是可以执行操作的
         */
        user = session.selectOne(statement,6);
        System.out.println(user);
        session.close();
    }
}
