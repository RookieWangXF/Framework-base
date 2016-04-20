package cn.rookie.bean;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by 201601120071 on 2016/1/16.
 */
public interface IUserMapper {
    @Insert("INSERT INTO users(name,age) VALUES(#{name},#{age})")
    public int add(User user);

    @Delete("DELETE from users WHERE id=#{id}")
    public int deleteById(int id);

    @Update("UPDATE users set name=#{name},age=#{age} WHERE id=#{id}")
    public int update(User user);

    @Select("SELECT * FROM users WHERE id=#{id}")
    public User getById(int id);

    @Select("Select * from users")
    public List<User> getAll();
}
