package cn.rookie.po;

import javax.persistence.*;

/**
 * Created by Rookie on 2016/5/18.
 * Package_name is cn.rookie.po
 * Description:
 */

/**
 * JPA标准注解
 * Entity：表面该类是一个Hibernate的持久化类
 * Table：指定该类映射的表，映射到new_inf表上
 * Id：映射为主键
 * GeneratedValue：主键的生成策略，此处为自增长
 */
@Entity
@Table(name = "new_inf")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //标题
    private String title;
    //内容
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
