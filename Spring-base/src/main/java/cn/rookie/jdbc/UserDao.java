package cn.rookie.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.jdbc
 * Description: 操作User表的字段
 */
public class UserDao {

    public boolean save() {

        boolean res = false;
        try {
            String sql = "INSERT INTO USER(NAME) VALUES('fei');";
            Connection conn = null;
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///spring","root","root");
            stmt = conn.createStatement();
            res = stmt.execute(sql);

            stmt.close();
            conn.close();
            return res;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
