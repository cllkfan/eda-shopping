package com.eda.entity;

import java.io.Serializable;

/**
 * (Track)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:19
 */
public class Track implements Serializable {
    private static final long serialVersionUID = -25888898186359179L;

    private Integer tId;

    private Integer tName;

    private String tCode;

    private Integer sId;

    private Integer rId;

    private String test1;

    private String test2;


    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public Integer getTName() {
        return tName;
    }

    public void setTName(Integer tName) {
        this.tName = tName;
    }

    public String getTCode() {
        return tCode;
    }

    public void setTCode(String tCode) {
        this.tCode = tCode;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
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

