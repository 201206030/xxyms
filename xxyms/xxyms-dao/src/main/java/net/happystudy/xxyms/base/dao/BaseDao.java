package net.happystudy.xxyms.base.dao;

import java.util.List;
/**
 * Dao顶级父类，提供公共方法
 * */
public interface BaseDao<K,V> {
    //查询所有
    public List<V> findAll();
    //插入
    public void insert(V entity);
    //批量插入
    public int insertList(List<V> list);
}
