package cn.rookie.bean;

import java.util.*;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.bean
 * Description:
 */
public class PersonCollection {
    private List<String> schools;
    private Map scores;
    private Map phaseAxe;
    private Set axes;
    private Properties health;
    private String[] books;

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public Map getScores() {
        return scores;
    }

    public void setScores(Map scores) {
        this.scores = scores;
    }

    public Set getAxes() {
        return axes;
    }

    public void setAxes(Set axes) {
        this.axes = axes;
    }

    public Properties getHealth() {
        return health;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public Map getPhaseAxe() {
        return phaseAxe;
    }

    public void setPhaseAxe(Map phaseAxe) {
        this.phaseAxe = phaseAxe;
    }

    public void test() {
        System.out.println(schools);
        System.out.println(scores);
        System.out.println(axes);
        System.out.println(phaseAxe);
        System.out.println(health);
        System.out.println(Arrays.toString(books));
    }
}
