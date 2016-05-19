package cn.rookie.bean;

import javax.persistence.*;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.bean
 * Description:
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String empName;
    private double salary;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
