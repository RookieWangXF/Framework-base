package cn.rookie.test;

import cn.rookie.bean.Classes;
import cn.rookie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
/**
 * Created by 201601120071 on 2016/1/16.
 */
public class ClassJunitTest {
    private SqlSession session;

    @Test
    public void testGetClass(){
        Classes classes;
        try {
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.classMapper.getClass";
            classes = session.selectOne(statement,1);
        } finally {
            session.close();
        }
        System.out.println(classes);
    }
    @Test
    public void testGetClass2(){
        Classes classes;
        try {
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.classMapper.getClass2";
            classes = session.selectOne(statement,1);
        } finally {
            session.close();
        }
        System.out.println(classes);
    }
    @Test
    public void testGetClass3(){
        Classes classes;
        try {
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.classMapper.getClass3";
            classes = session.selectOne(statement,1);
        } finally {
            session.close();
        }
        System.out.println(classes);
    }
    @Test
    public void testGetClass4(){
        Classes classes;
        try {
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.classMapper.getClass4";
            classes = session.selectOne(statement,2);
        } finally {
            session.close();
        }
        System.out.println(classes);
    }
}
