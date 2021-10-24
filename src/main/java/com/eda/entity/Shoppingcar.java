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

    private Integer shId;

    private Integer gid;

    private Integer shNumber;

    private Integer uId;

    private Date shCtime;

    private String test1;

    private String test2;


    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
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

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public Date getShCtime() {
        return shCtime;
    }

    public void setShCtime(Date shCtime) {
        this.shCtime = shCtime;
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

