package cn.rookie.jdbc;

import cn.rookie.jdbc.bean.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.jdbc
 * Description:
 */
public class UserDaoJdbcTemplate {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void save() {

        boolean res = false;
        String sql = "INSERT INTO USER(NAME) VALUES('lei');";
        jdbcTemplate.update(sql);
    }

    public User findById(int id) {
        String sql = "Select * from user where id=?";
        List<User> list = jdbcTemplate.query(sql,new MyResult(), id);
        return (list!=null && list.size()>0) ? list.get(0) : null;
    }

    public List<User> getAll() {
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql, new MyResult());
        return list;
    }
    class MyResult implements RowMapper<User> {

        // 如何封装一行记录
        @Override
        public User mapRow(ResultSet rs, int index) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            return user;
        }

    }
}
