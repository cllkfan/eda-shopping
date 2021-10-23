package com.eda.entity;

import java.io.Serializable;

/**
 * (Reciever)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:14
 */
public class Reciever implements Serializable {
    private static final long serialVersionUID = -59441232262390574L;
    /**
     * 收件编号
     */
    private Integer rId;
    /**
     * 收件人姓名
     */
    private String rName;
    /**
     * 收件人地址
     */
    private String rAddress;
    /**
     * 收件人电话
     */
    private String rTel;

    private String test1;

    private String test2;


    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public String getRName() {
        return rName;
    }

    public void setRName(String rName) {
        this.rName = rName;
    }

    public String getRAddress() {
        return rAddress;
    }

    public void setRAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    public String getRTel() {
        return rTel;
    }

    public void setRTel(String rTel) {
        this.rTel = rTel;
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

