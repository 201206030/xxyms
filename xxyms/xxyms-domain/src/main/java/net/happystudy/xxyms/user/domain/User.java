package net.happystudy.xxyms.user.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
//    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    private Integer id;
//    `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
    private String avatar;
//    `account` varchar(45) DEFAULT NULL COMMENT '账号',
    private String account;
//    `password` varchar(45) DEFAULT NULL COMMENT '密码',
    private String password;
//    `name` varchar(45) DEFAULT NULL COMMENT '名字',
    private String name;
//    `birthday` datetime DEFAULT NULL COMMENT '生日',
    private Date birthday;
//    `sex` int(11) DEFAULT NULL COMMENT '性别（1：男 2：女）',
    private Integer sex;
//    `email` varchar(45) DEFAULT NULL COMMENT '电子邮件',
    private String email;
//    `phone` varchar(45) DEFAULT NULL COMMENT '电话',
    private String phone;
//    `roleid` varchar(255) DEFAULT NULL COMMENT '角色id',
    private String roleid;
//    `deptid` int(11) DEFAULT NULL COMMENT '部门id',
    private Integer deptid;
//    `status` int(11) DEFAULT NULL COMMENT '状态(1：启用  2：冻结  3：删除）',
    private Integer status;
//    `createtime` datetime DEFAULT NULL COMMENT '创建时间',
    private Date createtime;
//    `version` int(11) DEFAULT NULL COMMENT '保留字段',
    private Integer version;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getRoleid() {
        return roleid;
    }
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
    public Integer getDeptid() {
        return deptid;
    }
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    
}