package com.eda.entity;

import java.io.Serializable;

/**
 * (Adminer)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:23:17
 */
public class Adminer implements Serializable {
    private static final long serialVersionUID = 918498559852834129L;

    private Integer ad_id;

    private String ad_username;

    private String ad_password;

    private String test1;

    private String test2;

    public Adminer() {
    }

    public Adminer(Integer ad_id, String ad_username, String ad_password, String test1, String test2) {
        this.ad_id = ad_id;
        this.ad_username = ad_username;
        this.ad_password = ad_password;
        this.test1 = test1;
        this.test2 = test2;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getAd_id() {
        return ad_id;
    }

    public void setAd_id(Integer ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_username() {
        return ad_username;
    }

    public void setAd_username(String ad_username) {
        this.ad_username = ad_username;
    }

    public String getAd_password() {
        return ad_password;
    }

    public void setAd_password(String ad_password) {
        this.ad_password = ad_password;
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

