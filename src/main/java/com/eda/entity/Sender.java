package com.eda.entity;

import java.io.Serializable;

/**
 * (Sender)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:15
 */
public class Sender implements Serializable {
    private static final long serialVersionUID = 652781844002511708L;

    private Integer sId;

    private Integer gid;

    private String sAddress;

    private String sPhone;

    private String sName;

    private String test1;

    private String test2;


    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
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

