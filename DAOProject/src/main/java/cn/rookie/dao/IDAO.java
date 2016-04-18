package cn.rookie.dao;

import cn.rookie.vo.Dept;

import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/18.
 * 定义公共的DAO操作接口标准
 * @param <K> 表示要操作的主键类型，由子接口实现
 * @param <V> 表示要操作的vo类型，由子接口实现
 */
public interface IDAO<K, V> {

    public boolean doCreate(V vo) throws Exception;

    public boolean doUpdate(V vo) throws Exception;

    public boolean doRemoveBatch(Set<K> ids) throws Exception;

    public V findById(K id) throws Exception;

    public List<V> findAll() throws Exception;
}
