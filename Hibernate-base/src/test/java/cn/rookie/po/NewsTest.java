package cn.rookie.po;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.po
 * Description: 根据配置会默认创建表
 */
public class NewsTest {

    @Test
    public void Test() {
        Configuration con = new Configuration().configure();

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

        SessionFactory sf = con.buildSessionFactory(serviceRegistry);

        Session sess = sf.openSession();

        Transaction tx = sess.beginTransaction();
        News news = new News();
        news.setTitle("今天天气不错");
        news.setContent("应该出去玩啊的发按地方噶的发告诉个");
        sess.save(news);

        tx.commit();
        sess.close();
        sf.close();

    }
}