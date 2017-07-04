package net.happystudy.xxyms.index.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.happystudy.xxyms.base.web.BaseController;
import net.happystudy.xxyms.notice.service.NoticeService;
import net.happystudy.xxyms.user.domain.Menu;
import net.happystudy.xxyms.user.domain.User;
import net.happystudy.xxyms.user.service.MenuService;
import net.happystudy.xxyms.user.service.UserService;
import net.happystudy.xxyms.utils.Constant;
import net.happystudy.xxyms.utils.JsonBean;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController{
    
    @Autowired
    private NoticeService noticeService;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private MenuService menuService;
    
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
     * 菜单，废弃
     * */
    @RequestMapping("/ajaxmenu")
    public String ajaxUserMenu(HttpSession session){
        JsonBean<List<Menu>> bean =new JsonBean<List<Menu>>();
        User user = (User) session.getAttribute(Constant.SESSIONUSER);
        if (session.getAttribute(Constant.FUNC_URI) != null) {
            List<String> funcs = menuService.getFuncUriByRoleId(user.getRole().getId());
            session.setAttribute(Constant.FUNC_URI, funcs);
        }
        return null;
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
            //左侧树形菜单
            Menu menu =menuService.getTreeMenu(user.getRole().getId());
            session.setAttribute("menu", menu);
            //用户功能权限
            List<String> funcs = menuService.getFuncUriByRoleId(user.getRole().getId());
            session.setAttribute(Constant.FUNC_URI, funcs);
            return "index/index";
        } 
        req.setAttribute("failInfo", "请检查：<br/>①用户名或密码是否错误<br/> ②用户是否被分配角色");
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
