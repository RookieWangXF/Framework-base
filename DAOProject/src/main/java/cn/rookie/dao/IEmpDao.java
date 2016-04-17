package cn.rookie.dao;



import cn.rookie.vo.Emp;

import java.util.List;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public interface IEmpDao {

    /**
     * 增加一个对象
     * @param vo
     * @return
     * @throws Exception
     */
    public boolean doCreate(Emp vo) throws Exception;

    /**
     * 修改对象
     * @param vo
     * @return
     * @throws Exception
     */
    public boolean doUpdate(Emp vo) throws Exception;

    /**
     * 通过id查找对应的对象
     * @param id
     * @return
     * @throws Exception
     */
    public Emp findById(Integer id) throws Exception;

    /**
     * 移除集合中所有的对应id用户
     * @param ids
     * @return
     * @throws Exception
     */
    public boolean doRemoveBatch(Set<Integer> ids) throws Exception;

    /**
     * 返回所有的用户
     * @return
     * @throws Exception
     */
    public List<Emp> findAll() throws Exception;

    /**
     * 分页进行数据的模糊查询
     * @param currentPage
     * @param lineSize
     * @param column
     * @param keyWord
     * @return 查询结果以list的形式返回
     * @throws Exception
     */
    public List<Emp> findAllSplit(Integer currentPage,Integer lineSize,String column, String keyWord) throws Exception;

    /**
     * 进行模糊查询数据的统计，没有则返回0
     * @param column
     * @param keyWord
     * @return
     * @throws Exception
     */
    public Integer getAllCount(String column, String keyWord) throws Exception;

}
