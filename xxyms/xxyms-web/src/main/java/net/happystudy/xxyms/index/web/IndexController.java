package net.happystudy.xxyms.index.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.happystudy.xxyms.base.web.BaseController;
import net.happystudy.xxyms.notice.domain.Notice;
import net.happystudy.xxyms.test.service.NoticeService;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController{
    
    @Autowired
    private NoticeService noticeService;
    
    /**
     * 首页
     * */
    @RequestMapping("/index")
    public String index(){
        return "index/index";
    }
    
    /**
     * 首页内容页
     * */
    @RequestMapping("/blackboard")
    public String blackboard(Model model){
        List<String> notices = noticeService.findContentsDesc();
        model.addAttribute("notices",notices);
        return "blackboard";
    }
    
}
