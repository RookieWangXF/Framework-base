package cn.rookie.test;

import cn.rookie.bean.User;
import cn.rookie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.*;


/**
 * Created by 201601120071 on 2016/1/16.
 */
public class TestTwoLevelCache {
    private SqlSession session;

    /**
     * 测试二级缓存
     * 使用两个不用的sqlSession对象去执行相同的查询条件的查询，第二次查询时不会再发送查询语句，而是直接在缓存中读取数据

         1. 映射语句文件中的所有select语句将会被缓存。
     　　2. 映射语句文件中的所有insert，update和delete语句会刷新缓存。
     　　3. 缓存会使用Least Recently Used（LRU，最近最少使用的）算法来收回。
     　　4. 缓存会根据指定的时间间隔来刷新。
     　　5. 缓存会存储1024个对象

     cache标签常用属性：

     <cache
     eviction="FIFO"  <!--回收策略为先进先出-->
     flushInterval="60000" <!--自动刷新时间60s-->
     size="512" <!--最多缓存512个引用对象-->
     readOnly="true"/> <!--只读-->
     */

    @org.junit.Test
    public void testCache(){
        String statement = "cn.rookie.bean.userMapper.getUser";
        SqlSessionFactory factory = MyBatisUtil.getSqlSessionFactory();
        SqlSession session1 = factory.openSession();
        SqlSession session2 = factory.openSession();

        //使用二级缓存的时候，User类要实现Serializable接口
        User user = session1.selectOne(statement,5);
        session1.commit(); //需要提交事务之后二级缓存才会起作用
        System.out.println("user="+user);

        user = session2.selectOne(statement,5);
        System.out.println("user2="+user);

    }

}

