package com.eda.entity;

import java.io.Serializable;

/**
 * (Token)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:19
 */
public class Token implements Serializable {
    private static final long serialVersionUID = 533826142150591893L;

    private Integer tkId;

    private Integer tkStatus;

    private String tkMessage;

    private Integer uId;

    private String test1;

    private String test2;


    public Integer getTkId() {
        return tkId;
    }

    public void setTkId(Integer tkId) {
        this.tkId = tkId;
    }

    public Integer getTkStatus() {
        return tkStatus;
    }

    public void setTkStatus(Integer tkStatus) {
        this.tkStatus = tkStatus;
    }

    public String getTkMessage() {
        return tkMessage;
    }

    public void setTkMessage(String tkMessage) {
        this.tkMessage = tkMessage;
    }

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
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

