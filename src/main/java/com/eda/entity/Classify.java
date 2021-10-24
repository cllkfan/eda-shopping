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

    public Classify() {
    }

    public Classify(Integer c_id, String c_type, Integer d_id, String test1, String test2) {
        this.c_id = c_id;
        this.c_type = c_type;
        this.d_id = d_id;
        this.test1 = test1;
        this.test2 = test2;
    }

    private Integer c_id;

    private String c_type;

    private Integer d_id;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_type() {
        return c_type;
    }

    public void setC_type(String c_type) {
        this.c_type = c_type;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
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

