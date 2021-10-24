package com.eda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Shoppingcar)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:16
 */
public class Shoppingcar implements Serializable {
    private static final long serialVersionUID = 332308484342650449L;

    public Shoppingcar() {
    }

    public Shoppingcar(int sh_id, int gid, int sh_number, int u_id, Date sh_ctime, String test1, String test2) {
        this.sh_id = sh_id;
        this.gid = gid;
        this.sh_number = sh_number;
        this.u_id = u_id;
        this.sh_ctime = sh_ctime;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int sh_id;

    private int gid;

    private int sh_number;

    private int u_id;

    private Date sh_ctime;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getSh_id() {
        return sh_id;
    }

    public void setSh_id(int sh_id) {
        this.sh_id = sh_id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getSh_number() {
        return sh_number;
    }

    public void setSh_number(int sh_number) {
        this.sh_number = sh_number;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public Date getSh_ctime() {
        return sh_ctime;
    }

    public void setSh_ctime(Date sh_ctime) {
        this.sh_ctime = sh_ctime;
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

