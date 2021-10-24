package com.eda.entity;

import java.io.Serializable;

/**
 * (Gimg)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:11
 */
public class Gimg implements Serializable {
    private static final long serialVersionUID = -28196120355792091L;

    public Gimg() {
    }

    public Gimg(int gimg_id, String gimg_name, int gid, String test1, String test2) {
        this.gimg_id = gimg_id;
        this.gimg_name = gimg_name;
        this.gid = gid;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int gimg_id;

    private String gimg_name;

    private int gid;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getGimg_id() {
        return gimg_id;
    }

    public void setGimg_id(int gimg_id) {
        this.gimg_id = gimg_id;
    }

    public String getGimg_name() {
        return gimg_name;
    }

    public void setGimg_name(String gimg_name) {
        this.gimg_name = gimg_name;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
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

