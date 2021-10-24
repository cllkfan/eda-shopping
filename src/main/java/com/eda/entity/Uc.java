package com.eda.entity;

import java.io.Serializable;

/**
 * (Uc)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:20
 */
public class Uc implements Serializable {
    private static final long serialVersionUID = 871662294492747434L;

    public Uc() {
    }

    public Uc(int uc_id, int u_id, int c_id, String test1, String test2) {
        this.uc_id = uc_id;
        this.u_id = u_id;
        this.c_id = c_id;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int uc_id;

    private int u_id;

    private int c_id;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getUc_id() {
        return uc_id;
    }

    public void setUc_id(int uc_id) {
        this.uc_id = uc_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
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

