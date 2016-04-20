package cn.rookie.test;

import cn.rookie.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.InputStream;

/**
 * Created by 201601120071 on 2016/1/15.
 */
public class Test {
    private static Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        //配置文件
        String resource = "conf.xml";
        //使用类加载器加载mybatis的配置文件
        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();

        String statement = "cn.rookie.bean.userMapper.getUser";

        User user = session.selectOne(statement, 2);
        System.out.println(user);

    }
}
