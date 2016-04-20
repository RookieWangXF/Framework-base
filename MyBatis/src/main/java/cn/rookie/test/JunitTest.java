package cn.rookie.test;

import cn.rookie.bean.User;
import cn.rookie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

/**
 * Created by 201601120071 on 2016/1/15.
 */
public class JunitTest {

    private SqlSession session = null;

    @Test
    public void testGetById(){
        User user;
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.userMapper.getById";
            user = session.selectOne(statement,5);
        } finally {
            session.close();
        }
        System.out.println(user);
    }
    @Test
    public void testUpdate(){
        int result;
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.userMapper.updateUser";
            User user = new User();
            user.setId(3);
            user.setName("huhu");
            user.setAge(211);
            result = session.update(statement,user);
        } finally {
            session.close();
        }
        System.out.println(result);
    }
    @Test
    public void testInsert(){
        int result;
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.userMapper.addUser";
            User user = new User();
            user.setName("huhu");
            user.setAge(20);
            result = session.insert(statement,user);
        } finally {
            session.close();
        }
        System.out.println(result);
    }
    @Test
    public void testDelete(){
        int result;
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.userMapper.deleteUser";
            result = session.delete(statement,3);
        } finally {
            session.close();
        }
        System.out.println(result);
    }

    @Test
    public void testGetAll(){
        List<User> list;
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.userMapper.getAllUsers";
            list = session.selectList(statement);
        } finally {
            session.close();
        }
        System.out.println(list);
    }

   /* @Test
    public void testGetUserCount(){
        Map<String,Integer> parameterMap = new HashMap<String,Integer>();
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.userMapper.getUserCount";
            parameterMap.put("sexid",1);
            parameterMap.put("usercount",-1);
            session.selectOne(statement,parameterMap);
            Integer result = parameterMap.get("usercount");
            System.out.println(result);
        } finally {
            session.close();
        }

    }*/
}
