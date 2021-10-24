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

    private Integer sh_id;

    private Integer gid;

    private Integer shNumber;

    private Integer u_Id;

    private Date sh_Ctime;

    private String test1;

    private String test2;


    public Integer getSh_id() {
        return sh_id;
    }

    public void setSh_id(Integer shid) {
        this.sh_id = sh_id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getShNumber() {
        return shNumber;
    }

    public void setShNumber(Integer shNumber) {
        this.shNumber = shNumber;
    }

    public Integer getU_Id() {
        return u_Id;
    }

    public void setU_Id(Integer uId) {
        this.u_Id = u_Id;
    }

    public Date getSh_Ctime() {
        return sh_Ctime;
    }

    public void setSh_Ctime(Date shCtime) {
        this.sh_Ctime = sh_Ctime;
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

