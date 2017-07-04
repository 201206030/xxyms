package net.happystudy.xxyms.user.domain;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable{

    private static final long serialVersionUID = 1L;
//    `id` Integer(65) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    private Integer id;
//    `code` varchar(255) DEFAULT NULL COMMENT '菜单编号',
    private String code;
//    `pcode` varchar(255) DEFAULT NULL COMMENT '菜单父编号',
    private String pcode;
//    `pcodes` varchar(255) DEFAULT NULL COMMENT '当前菜单的所有父菜单编号',
    private String pcodes;
//    `name` varchar(255) DEFAULT NULL COMMENT '菜单名称',
    private String name;
//    `icon` varchar(255) DEFAULT NULL COMMENT '菜单图标',
    private String icon;
//    `url` varchar(255) DEFAULT NULL COMMENT 'url地址',
    private String url;
//    `num` Integer(65) DEFAULT NULL COMMENT '菜单排序号',
    private Integer num;
//    `levels` Integer(65) DEFAULT NULL COMMENT '菜单层级',
    private Integer levels;
//    `ismenu` Integer(11) DEFAULT NULL COMMENT '是否是菜单（1：是  0：不是）',
    private Integer ismenu;
//    `tips` varchar(255) DEFAULT NULL COMMENT '备注',
    private String tips;
//    `status` Integer(65) DEFAULT NULL COMMENT '菜单状态 :  1:启用   0:不启用',
    private Integer status;
//    `isopen` Integer(11) DEFAULT NULL COMMENT '是否打开:    1:打开   0:不打开',
    private Integer isopen;
    private List<Menu> childMenu;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getPcode() {
        return pcode;
    }
    public void setPcode(String pcode) {
        this.pcode = pcode;
    }
    public String getPcodes() {
        return pcodes;
    }
    public void setPcodes(String pcodes) {
        this.pcodes = pcodes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }
    public Integer getLevels() {
        return levels;
    }
    public void setLevels(Integer levels) {
        this.levels = levels;
    }
    public Integer getIsmenu() {
        return ismenu;
    }
    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }
    public String getTips() {
        return tips;
    }
    public void setTips(String tips) {
        this.tips = tips;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getIsopen() {
        return isopen;
    }
    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }
    public List<Menu> getChildMenu() {
        return childMenu;
    }
    public void setChildMenu(List<Menu> childMenu) {
        this.childMenu = childMenu;
    }
    
}
