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

    private Integer cId;

    private Integer cType;

    private String test1;

    private String test2;


    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getCType() {
        return cType;
    }

    public void setCType(Integer cType) {
        this.cType = cType;
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

