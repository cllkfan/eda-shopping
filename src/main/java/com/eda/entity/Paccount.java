package com.eda.entity;

import java.io.Serializable;

/**
 * (Paccount)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:13
 */
public class Paccount implements Serializable {
    private static final long serialVersionUID = 374275976463146278L;

    private Integer pac_Id;

    private Integer u_Id;

    private String rest;

    private String test1;

    private String test2;


    public Integer getPac_Id() {
        return pac_Id;
    }

    public void setPac_Id(Integer pac_Id) {
        this.pac_Id = pac_Id;
    }

    public Integer getU_Id() {
        return u_Id;
    }

    public void setU_Id(Integer u_Id) {
        this.u_Id = u_Id;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
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

    public Paccount() {
    }

    public Paccount(Integer pac_Id, Integer u_Id, String rest, String test1, String test2) {
        this.pac_Id = pac_Id;
        this.u_Id = u_Id;
        this.rest = rest;
        this.test1 = test1;
        this.test2 = test2;
    }
}

