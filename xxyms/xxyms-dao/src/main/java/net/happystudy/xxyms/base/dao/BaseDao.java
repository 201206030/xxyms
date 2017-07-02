package net.happystudy.xxyms.base.dao;

import java.util.List;

public interface BaseDao<K,V> {
    public List<V> findAll();
    public void insert(V entity);
}
