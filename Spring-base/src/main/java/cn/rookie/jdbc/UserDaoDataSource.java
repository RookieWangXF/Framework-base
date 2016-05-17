package cn.rookie.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.jdbc
 * Description:
 */
public class UserDaoDataSource {
    // IOC容器注入
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean save() {

        boolean res = false;
        try {
            String sql = "INSERT INTO USER(NAME) VALUES('lei');";
            Connection conn = null;
            Statement stmt = null;
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            res = stmt.execute(sql);

            stmt.close();
            conn.close();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
