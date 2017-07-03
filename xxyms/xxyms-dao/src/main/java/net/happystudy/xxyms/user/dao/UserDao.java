package net.happystudy.xxyms.user.dao;

import org.springframework.stereotype.Repository;

import net.happystudy.xxyms.base.dao.BaseDao;
import net.happystudy.xxyms.user.domain.User;

@Repository
public interface UserDao extends BaseDao<Integer, User>{
    
    /**
     * 登录
     * */
    public User login(String account,String password);

}
