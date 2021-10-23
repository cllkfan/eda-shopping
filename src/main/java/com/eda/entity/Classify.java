package com.eda.entity;

import java.io.Serializable;

/**
 * (Classify)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:08
 */
public class Classify implements Serializable {
    private static final long serialVersionUID = -98480684224052671L;

    private Integer cId;

    private String cType;

    private Integer dId;

    private String test1;

    private String test2;


    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getCType() {
        return cType;
    }

    public void setCType(String cType) {
        this.cType = cType;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
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

