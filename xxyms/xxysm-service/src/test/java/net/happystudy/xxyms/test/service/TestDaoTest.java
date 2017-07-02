package net.happystudy.xxyms.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import net.happystudy.xxyms.test.dao.XxymsTestDao;
import net.happystudy.xxyms.test.domain.XxymsTest;

@ContextConfiguration(locations={"classpath*:/spring-context.xml","classpath*:/spring-mybatis.xml"})
public class TestDaoTest extends AbstractTransactionalTestNGSpringContextTests{
    @Autowired
    private XxymsTestDao xxymsTestDao;
    
    @Test
    public void testInsert(){
        XxymsTest test = new XxymsTest();
        test.setTestName("test11");
        xxymsTestDao.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test21");
        xxymsTestDao.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test131");
        xxymsTestDao.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test14");
        xxymsTestDao.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test15");
        xxymsTestDao.insert(test);
        System.out.println(test.getTestId());
    }
    
    @Test
    public void testFindAll(){
        List<XxymsTest> xxymsTests = xxymsTestDao.findAll();
        for(XxymsTest xxymsTest : xxymsTests){
            System.out.println(xxymsTest.getTestId()+":"+xxymsTest.getTestName());
        }
    }
    
    

}
