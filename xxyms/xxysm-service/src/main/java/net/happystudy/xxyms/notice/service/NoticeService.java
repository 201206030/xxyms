package net.happystudy.xxyms.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.happystudy.xxyms.notice.dao.NoticeDao;

@Service
public class NoticeService {

    @Autowired
    private NoticeDao noticeDao;
    
    /**
     * 通知模块业务类
     * */
    public List<String> findContentsDesc(){
        return noticeDao.findContentsDesc();
    }
}
