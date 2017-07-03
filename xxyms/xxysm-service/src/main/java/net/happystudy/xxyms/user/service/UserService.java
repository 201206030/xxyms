package net.happystudy.xxyms.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.happystudy.xxyms.user.dao.UserDao;
import net.happystudy.xxyms.user.domain.User;
import net.happystudy.xxyms.utils.EncryptUtil;

@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;
    
    /**
     * 登录
     * */
    public User login(String username,String password){
        return userDao.login(username,EncryptUtil.md5(password));
    }
}
