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

    public Users(int u_id) {
        this.u_id = u_id;
    }

    public Users(int u_id, String username, String pwd, String u_name, String u_tel, String u_email, Integer v_id, Date u_date, Date u_birth, String u_sex, int u_status, String test1, String test2) {
        this.u_id = u_id;
        this.username = username;
        this.pwd = pwd;
        this.u_name = u_name;
        this.u_tel = u_tel;
        this.u_email = u_email;
        this.v_id = v_id;
        this.u_date = u_date;
        this.u_birth = u_birth;
        this.u_sex = u_sex;
        this.u_status = u_status;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int u_id;

    private String username;

    private String pwd;

    private String u_name;

    private String u_tel;

    private String u_email;

    private Integer v_id;

    private Date u_date;

    private Date u_birth;

    private String u_sex;

    private int u_status;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
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

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_tel() {
        return u_tel;
    }

    public void setU_tel(String u_tel) {
        this.u_tel = u_tel;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public Integer getV_id() {
        return v_id;
    }

    public void setV_id(Integer v_id) {
        this.v_id = v_id;
    }

    public Date getU_date() {
        return u_date;
    }

    public void setU_date(Date u_date) {
        this.u_date = u_date;
    }

    public Date getU_birth() {
        return u_birth;
    }

    public void setU_birth(Date u_birth) {
        this.u_birth = u_birth;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public int getU_status() {
        return u_status;
    }

    public void setU_status(int u_status) {
        this.u_status = u_status;
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

