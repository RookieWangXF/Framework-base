package cn.rookie.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.bean
 * Description:
 */
@Entity
@Table(name = "dept")
public class Dept {

    @Id
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
