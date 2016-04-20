package cn.rookie.test;

import cn.rookie.bean.Order;
import cn.rookie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
/**
 * Created by 201601120071 on 2016/1/16.
 */
public class OrderJunitTest {
    private SqlSession session;
    @Test
    public void testGetOrderById(){
        Order order;
        try {
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.orderMapper.getOrderById";
            order = session.selectOne(statement,1);
        } finally {
            session.close();
        }
        System.out.println(order);
    }
    @Test
    public void testSelectOrder(){
        Order order;
        try {
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.orderMapper.selectOrder";
            order = session.selectOne(statement,1);
        } finally {
            session.close();
        }
        System.out.println(order);
    }
    @Test
    public void testGetOrderResultMap(){
        Order order;
        try {
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.orderMapper.getOrderResultMap";
            order = session.selectOne(statement,2);
        } finally {
            session.close();
        }
        System.out.println(order);
    }
}
