package com.eda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:21
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 506497009821533913L;

    private Integer uId;

    private String username;

    private String pwd;

    private String uName;

    private String uTel;

    private String uEmail;

    private Integer vId;

    private Date uDate;

    private Date uBirth;

    private String uSex;

    private Integer uStatus;

    private String test1;

    private String test2;


    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUTel() {
        return uTel;
    }

    public void setUTel(String uTel) {
        this.uTel = uTel;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public Integer getVId() {
        return vId;
    }

    public void setVId(Integer vId) {
        this.vId = vId;
    }

    public Date getUDate() {
        return uDate;
    }

    public void setUDate(Date uDate) {
        this.uDate = uDate;
    }

    public Date getUBirth() {
        return uBirth;
    }

    public void setUBirth(Date uBirth) {
        this.uBirth = uBirth;
    }

    public String getUSex() {
        return uSex;
    }

    public void setUSex(String uSex) {
        this.uSex = uSex;
    }

    public Integer getUStatus() {
        return uStatus;
    }

    public void setUStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

}

