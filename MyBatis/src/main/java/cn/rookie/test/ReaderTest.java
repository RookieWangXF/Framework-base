package cn.rookie.test;

import cn.rookie.bean.Reader;
import cn.rookie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
/**
 * Created by 201601120071 on 2016/1/15.
 */
public class ReaderTest {

    private SqlSession session;

    @Test
    public void testGetById(){
        Reader reader = new Reader();
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.readerMapper.selectReaderMoney";
            reader.setMoney(200);
            System.out.println(reader.getMoney());
            List<Reader> list = session.selectList(statement,reader);
            for (Reader temp : list){
                System.out.println(temp);
            }
        } finally {
            //session.close();
        }
    }
    @Test
    public void testchoose(){
        Reader reader = new Reader();
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.readerMapper.selectChoose";
            reader.setReaderID(3);
            reader.setUserID(1003);
            reader.setMoney(200);
            System.out.println(reader.getMoney());
            List<Reader> list = session.selectList(statement,reader);
            for (Reader temp : list){
                System.out.println(temp);
            }
        } finally {
            session.close();
        }
    }
    @Test
    public void testWhere(){
        Reader reader = new Reader();
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.readerMapper.selectWhere";
            reader.setReaderID(3);
            reader.setUserID(1003);
            reader.setMoney(200);
            System.out.println(reader.getMoney());
            List<Reader> list = session.selectList(statement,reader);
            for (Reader temp : list){
                System.out.println(temp);
            }
        } finally {
            session.close();
        }
    }
    @Test
    public void testSet(){
        Reader reader = new Reader();
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.readerMapper.updateSet";
            reader.setReaderID(3);
            reader.setUserID(1003);
            reader.setMoney(300);
            System.out.println(reader.getMoney());
            session.update(statement,reader);
            session.commit();
        } finally {
            session.close();
        }
    }
    @Test
    public void testForeach(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(4);
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.readerMapper.selectForeach";
            List<Reader> readers = session.selectList(statement,list);
            for (Reader reader : readers){
                System.out.println(reader);
            }
        } finally {
            session.close();
        }
    }
    @Test
    public void insertForeach(){
        ArrayList<Reader> list = new ArrayList<Reader>();
        list.add(new Reader(12,1006,600));
        list.add(new Reader(13,10077,700));
        list.add(new Reader(14,1008,800));
        for (Reader reader : list){
            System.out.println(reader);
        }
        try{
            session = MyBatisUtil.getSqlSession(true);
            String statement = "cn.rookie.bean.readerMapper.insertForeach";
            session.insert(statement,list);
        } finally {
            session.close();
        }
    }

}
