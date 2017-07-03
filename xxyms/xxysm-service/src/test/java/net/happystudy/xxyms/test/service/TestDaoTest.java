package net.happystudy.xxyms.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import net.happystudy.xxyms.test.dao.XxymsTestDao;
import net.happystudy.xxyms.test.domain.XxymsTest;

@ContextConfiguration(locations={"classpath*:/spring-context.xml","classpath*:/spring-mybatis.xml"})
public class TestDaoTest extends AbstractTestNGSpringContextTests{
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
    
    @Test
    public void testInsertList(){
        XxymsTest test1 = new XxymsTest();
        test1.setTestName("test100");
        XxymsTest test2 = new XxymsTest();
        test2.setTestName("test20e1");
        XxymsTest test3 = new XxymsTest();
        test3.setTestName("test20ww1");
        XxymsTest test4 = new XxymsTest();
        test4.setTestName("test201d");
        XxymsTest test5 = new XxymsTest();
        test5.setTestName("test621");
        List<XxymsTest> list = new ArrayList<XxymsTest>();
        list.add(test1);
        list.add(test2);
        list.add(test3);
        list.add(test4);
        list.add(test5);
        System.out.println(xxymsTestDao.insertList(list));
        System.out.println(list.get(0).getTestId());
        System.out.println(list.get(4).getTestId());
    }

}
