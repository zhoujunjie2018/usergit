package com.ism.user.model;

public class User {
    private Integer id;

    private String name;

    private String loginid;

    private String password;

    private Integer roleid;

    private String depat;

    private String area;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getDepat() {
        return depat;
    }

    public void setDepat(String depat) {
        this.depat = depat == null ? null : depat.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", loginid=").append(loginid);
        sb.append(", password=").append(password);
        sb.append(", roleid=").append(roleid);
        sb.append(", depat=").append(depat);
        sb.append(", area=").append(area);
        sb.append("]");
        return sb.toString();
    }
}