package net.happystudy.xxyms.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.happystudy.xxyms.base.dao.BaseDao;
import net.happystudy.xxyms.user.domain.Menu;

@Repository
public interface MenuDao extends BaseDao<Integer, Menu> {

    List<String> getFuncUriByRoleId(Integer id);
    
    List<Menu> getChildMenu(String pcode,Integer roleId);
}
