package com.eda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Vip)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:25
 */
public class Vip implements Serializable {
    private static final long serialVersionUID = -54918799012344861L;

    public Vip() {
    }


    public Vip(int v_id, int v_status, String v_price, String v_discount, Date v_createtime, Date v_endtime, String test1, String test2) {
        this.v_id = v_id;
        this.v_status = v_status;
        this.v_price = v_price;
        this.v_discount = v_discount;
        this.v_createtime = v_createtime;
        this.v_endtime = v_endtime;
        this.test1 = test1;
        this.test2 = test2;
    }

    /**
     * vip编号
     */
    private int v_id;
    /**
     * vip状态
     */
    private int v_status;
    /**
     * vip价格
     */
    private String v_price;
    /**
     * vip享受的折扣
     */
    private String v_discount;
    /**
     * vip开始时间
     */
    private Date v_createtime;
    /**
     * vip结束时间
     */
    private Date v_endtime;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getV_id() {
        return v_id;
    }

    public void setV_id(int v_id) {
        this.v_id = v_id;
    }

    public int getV_status() {
        return v_status;
    }

    public void setV_status(int v_status) {
        this.v_status = v_status;
    }

    public String getV_price() {
        return v_price;
    }

    public void setV_price(String v_price) {
        this.v_price = v_price;
    }

    public String getV_discount() {
        return v_discount;
    }

    public void setV_discount(String v_discount) {
        this.v_discount = v_discount;
    }

    public Date getV_createtime() {
        return v_createtime;
    }

    public void setV_createtime(Date v_createtime) {
        this.v_createtime = v_createtime;
    }

    public Date getV_endtime() {
        return v_endtime;
    }

    public void setV_endtime(Date v_endtime) {
        this.v_endtime = v_endtime;
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

