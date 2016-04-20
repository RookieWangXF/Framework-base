package cn.rookie.test;

import cn.rookie.bean.IUserMapper;
import cn.rookie.bean.User;
import cn.rookie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

/**
 * Created by 201601120071 on 2016/1/16.
 */
public class IJunitTest {
    private SqlSession session = null;

    @Test
    public void testUpdate(){
        session = MyBatisUtil.getSqlSession(true);
        IUserMapper mapper = session.getMapper(IUserMapper.class);
        User user = new User();
        user.setId(3);
        user.setName("huhu");
        user.setAge(211);
        int result = mapper.update(user);
        session.close();
        System.out.println(result);
    }
    @Test
    public void testInsert(){
        session = MyBatisUtil.getSqlSession(true);
        IUserMapper mapper = session.getMapper(IUserMapper.class);
        User user = new User();
        user.setName("huhu");
        user.setAge(20);
        int result = mapper.add(user);
        session.close();
        System.out.println(result);
    }
    @Test
    public void testDelete(){
        session = MyBatisUtil.getSqlSession(true);
        IUserMapper mapper = session.getMapper(IUserMapper.class);
        int result = mapper.deleteById(1);
        session.close();
        System.out.println(result);
    }

    @Test
    public void testGetById(){
        session = MyBatisUtil.getSqlSession(true);
        IUserMapper mapper = session.getMapper(IUserMapper.class);
        User user = mapper.getById(2);
        session.close();
        System.out.println(user);
    }

    @Test
    public void testGetAll(){
        session = MyBatisUtil.getSqlSession(true);
        IUserMapper mapper = session.getMapper(IUserMapper.class);
        List<User> list = mapper.getAll();
        session.close();
        System.out.println(list);
    }
}
