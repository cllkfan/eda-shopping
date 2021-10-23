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
    /**
     * vip编号
     */
    private Integer vId;
    /**
     * vip状态
     */
    private Integer vStatus;
    /**
     * vip价格
     */
    private String vPrice;
    /**
     * vip享受的折扣
     */
    private String vDiscount;
    /**
     * vip开始时间
     */
    private Date vCreatetime;
    /**
     * vip结束时间
     */
    private Date vEndtime;

    private String test1;

    private String test2;


    public Integer getVId() {
        return vId;
    }

    public void setVId(Integer vId) {
        this.vId = vId;
    }

    public Integer getVStatus() {
        return vStatus;
    }

    public void setVStatus(Integer vStatus) {
        this.vStatus = vStatus;
    }

    public String getVPrice() {
        return vPrice;
    }

    public void setVPrice(String vPrice) {
        this.vPrice = vPrice;
    }

    public String getVDiscount() {
        return vDiscount;
    }

    public void setVDiscount(String vDiscount) {
        this.vDiscount = vDiscount;
    }

    public Date getVCreatetime() {
        return vCreatetime;
    }

    public void setVCreatetime(Date vCreatetime) {
        this.vCreatetime = vCreatetime;
    }

    public Date getVEndtime() {
        return vEndtime;
    }

    public void setVEndtime(Date vEndtime) {
        this.vEndtime = vEndtime;
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

