package cn.rookie.service;


import cn.rookie.vo.Emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Rookie on 2016/4/13.
 * Description: 定义emp表业务层的执行标准
 * Project_name: DAOProject
 * Copyright (c) All Rights Reserved.
 */
public interface IEmpService {
    /**
     * 实现雇员的增加
     * @param vo
     * @return
     * @throws Exception
     */
    public boolean insert(Emp vo) throws Exception;

    /**
     * 实现雇员的修改
     * @param vo
     * @return
     * @throws Exception
     */
    public boolean update(Emp vo) throws Exception;

    /**
     * 实现雇员的删除
     * @param ids
     * @return
     * @throws Exception
     */
    public boolean delete(Set<Integer> ids) throws Exception;

    /**
     * 获取某一个雇员
     * @param id
     * @return
     * @throws Exception
     */
    public Emp get(int id) throws Exception;

    /**
     * 获取所有的雇员
     * @return
     * @throws Exception
     */
    public List<Emp> list() throws Exception;

    /**
     *
     * @param currentPage
     * @param lineSize
     * @param column
     * @param keyWord
     * @return
     * @throws Exception
     */
    public List<Emp> findAllSplit(int currentPage, int lineSize,String column,String keyWord) throws Exception;


    /**
     * 模糊查询某一列中的数量
     * @param column
     * @param keyWord
     * @return
     * @throws Exception
     */
    public Integer getAllCount(String column, String keyWord) throws Exception;

}
