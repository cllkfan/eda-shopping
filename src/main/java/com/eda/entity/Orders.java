package com.eda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private Integer o_Id;

    private String o_Price;

    private Integer o_Type;

    private String o_Posyfee;

    private Integer o_Status;

    private Date o_Createtime;

    private Date o_Updatetime;

    private Date o_Paytime;

    private Date o_Consigntime;

    private Date o_Endtime;

    private Integer t_Id;

    private Long u_Id;

    private Integer gid;

    private String test1;

    private String test2;

    public Orders() {
    }

    public Orders(Integer o_Id, String o_Price, Integer o_Type, String o_Posyfee, Integer o_Status, Date o_Createtime, Date o_Updatetime, Date o_Paytime, Date o_Consigntime, Date o_Endtime, Integer t_Id, Long u_Id, Integer gid, String test1, String test2) {
        this.o_Id = o_Id;
        this.o_Price = o_Price;
        this.o_Type = o_Type;
        this.o_Posyfee = o_Posyfee;
        this.o_Status = o_Status;
        this.o_Createtime = o_Createtime;
        this.o_Updatetime = o_Updatetime;
        this.o_Paytime = o_Paytime;
        this.o_Consigntime = o_Consigntime;
        this.o_Endtime = o_Endtime;
        this.t_Id = t_Id;
        this.u_Id = u_Id;
        this.gid = gid;
        this.test1 = test1;
        this.test2 = test2;
    }

}

