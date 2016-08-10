package cn.rookie;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie
 * Description:
 */
public class TestDatabase {
    private ApplicationContext ctx;
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("database.xml");
    }

    @Test
    public void testDatabase() throws SQLException {
        ComboPooledDataSource dataSource = (ComboPooledDataSource) ctx.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        ResultSet set = conn.prepareStatement("Select * from admin").executeQuery();
        while (set.next()) {
            System.out.print("id: " + set.getInt(1));
            System.out.print(" name: " + set.getString(2));
            System.out.print(" age: " + set.getInt(3));
            System.out.println();
        }
    }
}
