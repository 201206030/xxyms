package net.happystudy.xxyms.user.domain;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable{

    private static final long serialVersionUID = 1L;
    
    //  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
      private Integer id;
    //  `num` int(11) DEFAULT NULL COMMENT '序号',
      private Integer num;
    //  `pid` int(11) DEFAULT NULL COMMENT '父角色id',
      private Integer pid;
    //  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
      private String name;
    //  `deptid` int(11) DEFAULT NULL COMMENT '部门名称',
      private Integer deptid;
    //  `tips` varchar(255) DEFAULT NULL COMMENT '提示',
      private String tips;
    //  `version` int(11) DEFAULT NULL COMMENT '保留字段(暂时没用）',
      private String version;
     //菜单集合 
      private List<Menu> menus;
      
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getDeptid() {
        return deptid;
    }
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getTips() {
        return tips;
    }
    public void setTips(String tips) {
        this.tips = tips;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public List<Menu> getMenus() {
        return menus;
    }
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
      
      

}
