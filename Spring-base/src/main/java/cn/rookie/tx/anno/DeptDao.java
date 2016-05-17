package cn.rookie.tx.anno;

import cn.rookie.tx.Dept;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.tx.anno
 * Description:
 */
@Repository
public class DeptDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Dept dept){
        String sql = "insert into dept (deptName) values(?)";
        jdbcTemplate.update(sql,dept.getDeptName());
    }
}
