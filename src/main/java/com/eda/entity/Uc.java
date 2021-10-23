package com.eda.entity;

import java.io.Serializable;

/**
 * (Uc)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:20
 */
public class Uc implements Serializable {
    private static final long serialVersionUID = 871662294492747434L;

    private Integer uId;

    private Integer cId;

    private String test1;

    private String test2;


    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
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

