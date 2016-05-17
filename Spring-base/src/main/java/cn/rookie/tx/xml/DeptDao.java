package cn.rookie.tx.xml;

import cn.rookie.tx.Dept;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.tx.anno
 * Description:
 */
public class DeptDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Dept dept){
        String sql = "insert into dept (deptName) values(?)";
        jdbcTemplate.update(sql,dept.getDeptName());
    }
}
