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

    private Integer oId;

    private String oPrice;

    private Integer oType;

    private String oPosyfee;

    private Integer oStatus;

    private Date oCreatetime;

    private Date oUpdatetime;

    private Date oPaytime;

    private Date oConsigntime;

    private Date oEndtime;

    private Integer tId;

    private Long uId;

    private Integer gid;

    private String test1;

    private String test2;


    public Integer getOId() {
        return oId;
    }

    public void setOId(Integer oId) {
        this.oId = oId;
    }

    public String getOPrice() {
        return oPrice;
    }

    public void setOPrice(String oPrice) {
        this.oPrice = oPrice;
    }

    public Integer getOType() {
        return oType;
    }

    public void setOType(Integer oType) {
        this.oType = oType;
    }

    public String getOPosyfee() {
        return oPosyfee;
    }

    public void setOPosyfee(String oPosyfee) {
        this.oPosyfee = oPosyfee;
    }

    public Integer getOStatus() {
        return oStatus;
    }

    public void setOStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public Date getOCreatetime() {
        return oCreatetime;
    }

    public void setOCreatetime(Date oCreatetime) {
        this.oCreatetime = oCreatetime;
    }

    public Date getOUpdatetime() {
        return oUpdatetime;
    }

    public void setOUpdatetime(Date oUpdatetime) {
        this.oUpdatetime = oUpdatetime;
    }

    public Date getOPaytime() {
        return oPaytime;
    }

    public void setOPaytime(Date oPaytime) {
        this.oPaytime = oPaytime;
    }

    public Date getOConsigntime() {
        return oConsigntime;
    }

    public void setOConsigntime(Date oConsigntime) {
        this.oConsigntime = oConsigntime;
    }

    public Date getOEndtime() {
        return oEndtime;
    }

    public void setOEndtime(Date oEndtime) {
        this.oEndtime = oEndtime;
    }

    public Integer getTId() {
        return tId;
    }

    public void setTId(Integer tId) {
        this.tId = tId;
    }

    public Long getUId() {
        return uId;
    }

    public void setUId(Long uId) {
        this.uId = uId;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
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

