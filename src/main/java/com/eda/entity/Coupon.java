package com.eda.entity;

import java.io.Serializable;

/**
 * (Coupon)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:10
 */
public class Coupon implements Serializable {
    private static final long serialVersionUID = -61360993860118834L;

    public Coupon() {
    }

    public Coupon(int c_id, int c_type, String test1, String test2) {
        this.c_id = c_id;
        this.c_type = c_type;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int  c_id;

    private int c_type;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getC_type() {
        return c_type;
    }

    public void setC_type(int c_type) {
        this.c_type = c_type;
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

