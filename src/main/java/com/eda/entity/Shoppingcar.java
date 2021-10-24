package com.eda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Shoppingcar)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:16
 */
public class Shoppingcar implements Serializable {
    private static final long serialVersionUID = 332308484342650449L;

    private Integer sh_id;

    private Integer gid;

    private Integer sh_Number;

    private Integer u_Id;

    private Date sh_Ctime;

    private String test1;

    private String test2;


    public Integer getSh_id() {
        return sh_id;
    }

    public void setSh_id(Integer shid) {
        this.sh_id = sh_id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getSh_Number() {
        return sh_Number;
    }

    public void setSh_Number(Integer sh_Number) {
        this.sh_Number = sh_Number;
    }

    public Integer getU_Id() {
        return u_Id;
    }

    public void setU_Id(Integer uId) {
        this.u_Id = u_Id;
    }

    public Date getSh_Ctime() {
        return sh_Ctime;
    }

    public void setSh_Ctime(Date shCtime) {
        this.sh_Ctime = sh_Ctime;
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

    public Shoppingcar() {
    }

    public Shoppingcar(Integer sh_id, Integer gid, Integer sh_Number, Integer u_Id, Date sh_Ctime, String test1, String test2) {
        this.sh_id = sh_id;
        this.gid = gid;
        this.sh_Number = sh_Number;
        this.u_Id = u_Id;
        this.sh_Ctime = sh_Ctime;
        this.test1 = test1;
        this.test2 = test2;
    }
}

