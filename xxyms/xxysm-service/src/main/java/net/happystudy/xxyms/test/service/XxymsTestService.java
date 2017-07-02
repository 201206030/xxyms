package net.happystudy.xxyms.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.happystudy.xxyms.test.dao.XxymsTestDao;
import net.happystudy.xxyms.test.domain.XxymsTest;

@Service
public class XxymsTestService {

    @Autowired
    private XxymsTestDao xxymsTestDao;
    
    public List<XxymsTest> findAll(){
        return xxymsTestDao.findAll();
    }
    public void insert(XxymsTest entity){
        xxymsTestDao.insert(entity);
    }
}
