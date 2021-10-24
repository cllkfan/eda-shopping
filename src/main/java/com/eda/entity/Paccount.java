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

    private int pac_Id;

    private int u_Id;

    private String rest;

    private String test1;

    private String test2;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getPac_Id() {
        return pac_Id;
    }

    public void setPac_Id(int pac_Id) {
        this.pac_Id = pac_Id;
    }

    public int getU_Id() {
        return u_Id;
    }

    public void setU_Id(int u_Id) {
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

}

