package com.eda.entity;

import java.io.Serializable;

/**
 * (Reciever)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:14
 */
public class Reciever implements Serializable {
    private static final long serialVersionUID = -59441232262390574L;
    /**
     * 收件编号
     */
    private Integer r_Id;
    /**
     * 收件人姓名
     */
    private String r_Name;
    /**
     * 收件人地址
     */
    private String r_Address;
    /**
     * 收件人电话
     */
    private String r_Tel;

    private String test1;

    private String test2;


    public Integer getR_Id() {
        return r_Id;
    }

    public void setR_Id(Integer r_Id) {
        this.r_Id = r_Id;
    }

    public String getR_Name() {
        return r_Name;
    }

    public void setR_Name(String r_Name) {
        this.r_Name = r_Name;
    }

    public String getR_Address() {
        return r_Address;
    }

    public void setR_Address(String r_Address) {
        this.r_Address = r_Address;
    }

    public String getR_Tel() {
        return r_Tel;
    }

    public void setR_Tel(String r_Tel) {
        this.r_Tel = r_Tel;
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

    public Reciever() {
    }

    public Reciever(Integer r_Id, String r_Name, String r_Address, String r_Tel, String test1, String test2) {
        this.r_Id = r_Id;
        this.r_Name = r_Name;
        this.r_Address = r_Address;
        this.r_Tel = r_Tel;
        this.test1 = test1;
        this.test2 = test2;
    }
}

