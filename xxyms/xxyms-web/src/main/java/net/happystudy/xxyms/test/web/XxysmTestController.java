package net.happystudy.xxyms.test.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.happystudy.xxyms.base.web.BaseController;
import net.happystudy.xxyms.test.domain.XxymsTest;
import net.happystudy.xxyms.test.service.XxymsTestService;

@Controller
@RequestMapping("/test")
public class XxysmTestController extends BaseController{
    
    @Autowired
    private XxymsTestService xxymsTestService;
    
    @RequestMapping("/test")
    public String index(Model model){
        XxymsTest test = new XxymsTest();
        test.setTestName("test1");
        xxymsTestService.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test2");
        xxymsTestService.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test3");
        xxymsTestService.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test4");
        xxymsTestService.insert(test);
        System.out.println(test.getTestId());
        test = new XxymsTest();
        test.setTestName("test5");
        xxymsTestService.insert(test);
        System.out.println(test.getTestId());
        List<XxymsTest> list = xxymsTestService.findAll();
        model.addAttribute("list", list);
        return "test";
    }

    
}
