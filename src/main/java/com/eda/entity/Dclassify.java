package com.eda.entity;

import java.io.Serializable;

/**
 * (Dclassify)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:10
 */
public class Dclassify implements Serializable {
    private static final long serialVersionUID = 302321985193736175L;

    public Dclassify() {
    }

    public Dclassify(int d_id, int g_id, String d_type, String test1, String test2) {
        this.d_id = d_id;
        this.g_id = g_id;
        this.d_type = d_type;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int d_id;

    private int g_id;

    private String d_type;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getD_type() {
        return d_type;
    }

    public void setD_type(String d_type) {
        this.d_type = d_type;
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

