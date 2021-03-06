package cn.rookie.dao.impl;

import cn.rookie.dao.IDeptDAO;
import cn.rookie.vo.Dept;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/18.
 */
public class DeptDaoImpl implements IDeptDAO{
    private static Logger logger = Logger.getLogger(DeptDaoImpl.class);
    private Connection conn;
    private PreparedStatement pstmt;

    public DeptDaoImpl(Connection conn) {
        this.conn = conn;
    }
    @Override
    public boolean doCreate(Dept vo) throws Exception {
        String sql = "INSERT INTO dept(deptno,dname,loc) VALUES (?,?,?)";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1,vo.getDeptno());
        this.pstmt.setString(2,vo.getDname());
        this.pstmt.setString(3,vo.getLoc());
        logger.info("doCreate-sql:" + sql);
        return this.pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean doUpdate(Dept vo) throws Exception {
        String sql = "UPDATE dept SET dname=?,loc=? WHERE deptno=?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1,vo.getDname());
        this.pstmt.setString(2,vo.getLoc());
        this.pstmt.setInt(3,vo.getDeptno());
        logger.info("doUpdate-sql:" + sql);
        return this.pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean doRemoveBatch(Set<Integer> ids) throws Exception {
        if (ids == null || ids.size() == 0) {
            return false;
        }

        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM dept WHERE deptno IN (");
        Iterator<Integer> iter = ids.iterator();
        while (iter.hasNext()) {
            sql.append(iter.next()).append(",");
        }
        sql.delete(sql.length() - 1, sql.length()).append(")");
        logger.info("doRemoveBatch-sql:" + sql);
        this.pstmt = this.conn.prepareStatement(sql.toString());
        return this.pstmt.executeUpdate() == ids.size();
    }

    @Override
    public Dept findById(Integer id) throws Exception {

        Dept vo = null;
        String sql = "SELECT deptno,dname,loc FROM dept WHERE deptno = ?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, id);
        logger.info("findById-sql:" + sql);
        ResultSet rs = this.pstmt.executeQuery();
        if (rs.next()) {
            vo = new Dept();
            vo.setDeptno(rs.getInt(1));
            vo.setDname(rs.getString(2));
            vo.setLoc(rs.getString(3));
        }
        return vo;
    }

    @Override
    public List<Dept> findAll() throws Exception {
        List<Dept> all = new ArrayList<Dept>();
        String sql = "SELECT deptno,dname,loc FROM dept";
        logger.info("findAll-sql:" + sql);
        this.pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = this.pstmt.executeQuery();
        while (rs.next()) {
            Dept vo = new Dept();
            vo.setDeptno(rs.getInt(1));
            vo.setDname(rs.getString(2));
            vo.setLoc(rs.getString(3));
            all.add(vo);
        }
        return all;
    }
}
