package net.happystudy.xxyms.index.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.happystudy.xxyms.base.web.BaseController;
import net.happystudy.xxyms.notice.service.NoticeService;
import net.happystudy.xxyms.user.domain.User;
import net.happystudy.xxyms.user.service.UserService;
import net.happystudy.xxyms.utils.Constant;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController{
    
    @Autowired
    private NoticeService noticeService;
    
    @Autowired
    private UserService userService;
    
    /**
     * 首页
     * */
    @RequestMapping("/index")
    public String index(HttpSession session){
        User userSession = (User) session.getAttribute(Constant.SESSIONUSER);
        if(userSession == null){
            return "index/login";
        }
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
    
    /**
     * 登录
     * */
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest req){
        User user = userService.login(username, password);
        if (user!=null) {
            //登录成功
            HttpSession session = req.getSession();
            session.setAttribute(Constant.SESSIONUSER, user);
            return "index/index";
        } 
        req.setAttribute("failInfo", "用户名或密码错误");
        return "index/login";
    }
    
    /**
     * 退出/logout
     * */
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "index/login";
    }
}
