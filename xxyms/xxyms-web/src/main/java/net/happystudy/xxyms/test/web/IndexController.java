package net.happystudy.xxyms.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.happystudy.xxyms.base.web.BaseController;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController{
    
    @RequestMapping("/index")
    public String index(){
        return "index/index";
    }

    
}
