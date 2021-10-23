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

    private Integer gimgId;

    private String gimgName;

    private Integer gid;

    private String test1;

    private String test2;


    public Integer getGimgId() {
        return gimgId;
    }

    public void setGimgId(Integer gimgId) {
        this.gimgId = gimgId;
    }

    public String getGimgName() {
        return gimgName;
    }

    public void setGimgName(String gimgName) {
        this.gimgName = gimgName;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
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

