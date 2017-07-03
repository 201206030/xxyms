package net.happystudy.xxyms.base.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import net.happystudy.xxyms.user.domain.User;
import net.happystudy.xxyms.utils.Constant;

public class AdminInterceptor implements HandlerInterceptor {
    
    private List<String> excludeUrls;// 不需要拦截的资源
    
    private List<String> resources;//静态资源
    
    public List<String> getExcludeUrls() {
        return excludeUrls;
    }

    public void setExcludeUrls(List<String> excludeUrls) {
        this.excludeUrls = excludeUrls;
    }

    
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse arg1, Object arg2) throws Exception {
        User user = (User) req.getSession().getAttribute(Constant.SESSIONUSER);
        if (user != null) {
            return true;
        }
        String uri = req.getRequestURI();
        uri=uri.replaceFirst(req.getContextPath(), "");
        Logger.getLogger(AdminInterceptor.class).debug("uri="+uri);
        if (excludeUrls != null && excludeUrls.contains(uri)) {
            return true;
        }
        if (resources != null && resources.size() > 0) {
            for (String resource : resources) {
                if (uri.matches(resource)) {
                    return true;
                }
            }
        }
        return false;
    }

}
