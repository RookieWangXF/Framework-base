package cn.rookie.dao.impl;



import cn.rookie.dao.IEmpDao;
import cn.rookie.vo.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public class EmpDaoImpl implements IEmpDao {

    private Connection conn;
    private PreparedStatement pstmt;

    public EmpDaoImpl(Connection conn) {
        this.conn = conn;
    }


    public boolean doCreate(Emp vo) throws Exception {
        String sql= "INSERT INTO emp(empno,ename,job,hiredate,sal,comm) VALUES (?,?,?,?,?,?)";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, vo.getEmpno());
        this.pstmt.setString(2, vo.getEname());
        this.pstmt.setString(3, vo.getJob());
        this.pstmt.setDate(4, new java.sql.Date(vo.getHiredate().getTime()));
        this.pstmt.setDouble(5, vo.getSal());
        this.pstmt.setDouble(6, vo.getComm());
        return this.pstmt.executeUpdate() > 0;
    }

    public boolean doUpdate(Emp vo) throws Exception {
        String sql= "UPDATE emp SET ename=?,job=?,hiredate=?,sal=?,comm=? WHERE empno=?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, vo.getEname());
        this.pstmt.setString(2, vo.getJob());
        this.pstmt.setDate(3, new java.sql.Date(vo.getHiredate().getTime()));
        this.pstmt.setDouble(4, vo.getSal());
        this.pstmt.setDouble(5, vo.getComm());
        this.pstmt.setInt(6, vo.getEmpno());
        return this.pstmt.executeUpdate() > 0;
    }

    public Emp findById(Integer id) throws Exception {
        Emp vo = null;
        String sql = "SELECT empno,ename,job,hiredate,sal,comm FROM emp WHERE empno = ?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setInt(1, id);
        ResultSet rs = this.pstmt.executeQuery();
        if (rs.next()) {
            vo = new Emp();
            vo.setEmpno(rs.getInt(1));
            vo.setEname(rs.getString(2));
            vo.setJob(rs.getString(3));
            vo.setHiredate(rs.getDate(4));
            vo.setSal(rs.getDouble(5));
            vo.setComm(rs.getDouble(6));
        }
        return vo;
    }

    public boolean doRemoveBatch(Set<Integer> ids) throws Exception {
        if (ids == null || ids.size() == 0) {
            return false;
        }

        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM emp WHERE empno IN (");
        Iterator<Integer> iter = ids.iterator();
        while (iter.hasNext()) {
            sql.append(iter.next()).append(",");
        }
        sql.delete(sql.length() - 1, sql.length()).append(")");
        System.out.println(sql.toString());
        this.pstmt = this.conn.prepareStatement(sql.toString());
        return this.pstmt.executeUpdate() == ids.size();
    }

    public List<Emp> findAll() throws Exception {
        List<Emp> all = new ArrayList<Emp>();
        String sql = "SELECT empno,ename,job,hiredate,sal,comm FROM emp";
        this.pstmt = this.conn.prepareStatement(sql);
        ResultSet rs = this.pstmt.executeQuery();
        while (rs.next()) {
            Emp vo = new Emp();
            vo.setEmpno(rs.getInt(1));
            vo.setEname(rs.getString(2));
            vo.setJob(rs.getString(3));
            vo.setHiredate(rs.getDate(4));
            vo.setSal(rs.getDouble(5));
            vo.setComm(rs.getDouble(6));
            all.add(vo);
        }
        return all;
    }

    public List<Emp> findAllSplit(Integer currentPage, Integer lineSize, String column, String keyWord) throws Exception {
        List<Emp> all = new ArrayList<Emp>();
        String sql = "SELECT empno,ename,job,hiredate,sal,comm FROM emp " +
                "WHERE " + column + " LIKE ? LIMIT "+ currentPage * lineSize +","+lineSize;
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, "%" + keyWord + "%");
        ResultSet rs = this.pstmt.executeQuery();
        while (rs.next()) {
            Emp vo = new Emp();
            vo.setEmpno(rs.getInt(1));
            vo.setEname(rs.getString(2));
            vo.setJob(rs.getString(3));
            vo.setHiredate(rs.getDate(4));
            vo.setSal(rs.getDouble(5));
            vo.setComm(rs.getDouble(6));
            all.add(vo);
        }
        return all;
    }

    public Integer getAllCount(String column, String keyWord) throws Exception {
        String sql = "SELECT COUNT(empno) FROM emp WHERE " + column + " LIKE ? ";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, "%" + keyWord + "%");
        ResultSet rs = this.pstmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return null;
    }
}
