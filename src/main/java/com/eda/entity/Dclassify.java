package com.eda.entity;

import java.io.Serializable;

/**
 * (Dclassify)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:10
 */
public class Dclassify implements Serializable {
    private static final long serialVersionUID = 302321985193736175L;

    private Integer dId;

    private Integer gId;

    private String dType;

    private String test1;

    private String test2;


    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

    public Integer getGId() {
        return gId;
    }

    public void setGId(Integer gId) {
        this.gId = gId;
    }

    public String getDType() {
        return dType;
    }

    public void setDType(String dType) {
        this.dType = dType;
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

