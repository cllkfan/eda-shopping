package com.eda.entity;

import java.io.Serializable;

/**
 * (Commit)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:09
 */
public class Commit implements Serializable {
    private static final long serialVersionUID = -91931955149413472L;

    private Integer comId;

    private String comMessage;

    private String comNick;

    private Integer comRate;

    private String test1;

    private String test2;


    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComMessage() {
        return comMessage;
    }

    public void setComMessage(String comMessage) {
        this.comMessage = comMessage;
    }

    public String getComNick() {
        return comNick;
    }

    public void setComNick(String comNick) {
        this.comNick = comNick;
    }

    public Integer getComRate() {
        return comRate;
    }

    public void setComRate(Integer comRate) {
        this.comRate = comRate;
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

