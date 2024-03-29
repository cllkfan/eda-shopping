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

    public Sender() {
    }

    public Sender(int s_id, int gid, String s_Address, String s_Phone, String s_Name, String test1, String test2) {
        this.s_id = s_id;
        this.gid = gid;
        this.s_Address = s_Address;
        this.s_Phone = s_Phone;
        this.s_Name = s_Name;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int s_id;

    private int gid;

    private String s_Address;

    private String s_Phone;

    private String s_Name;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getS_Address() {
        return s_Address;
    }

    public void setS_Address(String s_Address) {
        this.s_Address = s_Address;
    }

    public String getS_Phone() {
        return s_Phone;
    }

    public void setS_Phone(String s_Phone) {
        this.s_Phone = s_Phone;
    }

    public String getS_Name() {
        return s_Name;
    }

    public void setS_Name(String s_Name) {
        this.s_Name = s_Name;
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

