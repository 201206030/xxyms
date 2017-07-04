package net.happystudy.xxyms.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.happystudy.xxyms.user.dao.MenuDao;
import net.happystudy.xxyms.user.domain.Menu;

@Service
public class MenuService {
    
    @Autowired
    private MenuDao menuDao;

    public List<String> getFuncUriByRoleId(Integer roleId){
        return menuDao.getFuncUriByRoleId(roleId);
    }
    
    public Menu getTreeMenu(Integer roleId){
        Menu menu = new Menu();
        getAndSetchildTreeMenu("0",roleId,menu);
        return menu;
    }
    
    private void getAndSetchildTreeMenu(String pcode,Integer roleId,Menu menu){
        List<Menu> menus =menuDao.getChildMenu(pcode, roleId);
        if ((menus != null) && (menus.size() > 0)) {
            menu.setChildMenu(menus);
            for (Menu childMenu : menus) {
                getAndSetchildTreeMenu(childMenu.getCode(),roleId,childMenu);
            }
        }
    }
}
