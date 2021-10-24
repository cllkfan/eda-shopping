package com.eda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:12
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = -60495679738311965L;

    public Orders() {
    }

    public Orders(int o_id, String o_price, int o_type, String o_posyfee, int o_status, Date o_createtime, Date o_updatetime, Date o_paytime, Date o_consigntime, Date o_endtime, int t_id, Long u_id, int gid, String test1, String test2) {
        this.o_id = o_id;
        this.o_price = o_price;
        this.o_type = o_type;
        this.o_posyfee = o_posyfee;
        this.o_status = o_status;
        this.o_createtime = o_createtime;
        this.o_updatetime = o_updatetime;
        this.o_paytime = o_paytime;
        this.o_consigntime = o_consigntime;
        this.o_endtime = o_endtime;
        this.t_id = t_id;
        this.u_id = u_id;
        this.gid = gid;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int o_id;

    private String o_price;

    private int o_type;

    private String o_posyfee;

    private int o_status;

    private Date o_createtime;

    private Date o_updatetime;

    private Date o_paytime;

    private Date o_consigntime;

    private Date o_endtime;

    private int t_id;

    private Long u_id;

    private int gid;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public String getO_price() {
        return o_price;
    }

    public void setO_price(String o_price) {
        this.o_price = o_price;
    }

    public int getO_type() {
        return o_type;
    }

    public void setO_type(int o_type) {
        this.o_type = o_type;
    }

    public String getO_posyfee() {
        return o_posyfee;
    }

    public void setO_posyfee(String o_posyfee) {
        this.o_posyfee = o_posyfee;
    }

    public int getO_status() {
        return o_status;
    }

    public void setO_status(int o_status) {
        this.o_status = o_status;
    }

    public Date getO_createtime() {
        return o_createtime;
    }

    public void setO_createtime(Date o_createtime) {
        this.o_createtime = o_createtime;
    }

    public Date getO_updatetime() {
        return o_updatetime;
    }

    public void setO_updatetime(Date o_updatetime) {
        this.o_updatetime = o_updatetime;
    }

    public Date getO_paytime() {
        return o_paytime;
    }

    public void setO_paytime(Date o_paytime) {
        this.o_paytime = o_paytime;
    }

    public Date getO_consigntime() {
        return o_consigntime;
    }

    public void setO_consigntime(Date o_consigntime) {
        this.o_consigntime = o_consigntime;
    }

    public Date getO_endtime() {
        return o_endtime;
    }

    public void setO_endtime(Date o_endtime) {
        this.o_endtime = o_endtime;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
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

