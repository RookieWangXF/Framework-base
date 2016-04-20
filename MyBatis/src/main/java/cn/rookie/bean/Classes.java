package cn.rookie.bean;

import java.util.List;

/**
 * Created by 201601120071 on 2016/1/16.
 */
public class Classes {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher+ ", students=" + students +"]";
    }
}
