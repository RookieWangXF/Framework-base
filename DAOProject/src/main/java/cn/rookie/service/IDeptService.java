package cn.rookie.service;

import cn.rookie.vo.Dept;

import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/19.
 */
public interface IDeptService {
    public boolean insert(Dept vo) throws Exception;
    public boolean update(Dept vo) throws Exception;
    public boolean delete(Set<Integer> ids) throws Exception;
    public List<Dept> list() throws Exception;
    public Dept get(int id) throws Exception;
}
