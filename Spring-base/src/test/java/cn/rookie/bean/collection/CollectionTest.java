package cn.rookie.bean.collection;

import cn.rookie.bean.IAxe;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by Rookie on 2016/8/10.
 * Package_name is cn.rookie.bean.collection
 * Description:
 */
public class CollectionTest {

    private ApplicationContext ctx;
    private PersonCollection collection;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("bean/collection.xml");
        collection = (PersonCollection) ctx.getBean("personCollection");
    }

    @Test
    public void getSchools() throws Exception {
        List<String> list = collection.getSchools();
        System.out.println("list");
        for (String s : list) {
            System.out.print(s + " : ");
        }
    }

    @Test
    public void getScores() throws Exception {
        Map<String, String> scores = collection.getScores();
        Set<Map.Entry<String, String>> entrys = scores.entrySet();
        Iterator iter = entrys.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }

    @Test
    public void getAxes() throws Exception {
        Set set = collection.getAxes();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    @Test
    public void getHealth() throws Exception {
        Properties properties = collection.getHealth();
        Set<Map.Entry<Object, Object>> entrys = properties.entrySet();
        Iterator iter = entrys.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) iter.next();
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }

    @Test
    public void getBooks() throws Exception {
        String[] strings = collection.getBooks();
        for (String s : strings) {
            System.out.println(s);
        }
    }

    @Test
    public void getPhaseAxe() throws Exception {
        Map map = collection.getPhaseAxe();
        Set<Map.Entry<String, IAxe>> entrys = map.entrySet();
        Iterator iter = entrys.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, IAxe> entry = (Map.Entry<String, IAxe>) iter.next();
            System.out.println(entry.getKey()+ " : " + entry.getValue().chop());
        }
    }



}