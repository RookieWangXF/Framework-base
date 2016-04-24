package cn.rookie.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.InputStream;

/**
 * Created by 201601120071 on 2016/1/16.
 */
public class MyBatisUtil {

    private static Logger logger = Logger.getLogger(MyBatisUtil.class);

    public static SqlSessionFactory getSqlSessionFactory(){

        String resource = "conf.xml";
        InputStream is = MyBatisUtil.class.getClassLoader().getResourceAsStream(resource);
        logger.info("conf.xml : " + is);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        return factory;
    }

    public static SqlSession getSqlSession(){
        return getSqlSessionFactory().openSession();
    }

    public static SqlSession getSqlSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }

}
