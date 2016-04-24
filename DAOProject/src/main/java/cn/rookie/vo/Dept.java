package cn.rookie.vo;

import java.io.Serializable;

/**
 * Created by Rookie on 2016/4/18.
 */
public class Dept implements Serializable {

    private Integer deptno;
    private String dname;
    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "deptno:"+this.deptno+" dname: "+this.dname+" loc: "+this.loc;
    }
}
