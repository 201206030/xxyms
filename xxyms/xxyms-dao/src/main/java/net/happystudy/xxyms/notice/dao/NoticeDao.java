package net.happystudy.xxyms.notice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.happystudy.xxyms.base.dao.BaseDao;
import net.happystudy.xxyms.notice.domain.Notice;

/**
 * 通知模块Dao
 * */
@Repository
public interface NoticeDao extends BaseDao<Integer, Notice>{
    /**
     * 查询通知内容
     * */
    public List<String> findContentsDesc();
}
