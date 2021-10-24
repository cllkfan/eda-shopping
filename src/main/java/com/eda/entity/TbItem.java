package com.eda.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbItem)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:18
 */
public class TbItem implements Serializable {
    private static final long serialVersionUID = 360998025079750857L;

    public TbItem() {
    }

    public TbItem(Long gid, String title, String sell_Point, Long price, int num, String barcode, String image, Long cid, int status, Date created, Date updated, String test1, String test2) {
        this.gid = gid;
        this.title = title;
        this.sell_Point = sell_Point;
        this.price = price;
        this.num = num;
        this.barcode = barcode;
        this.image = image;
        this.cid = cid;
        this.status = status;
        this.created = created;
        this.updated = updated;
        this.test1 = test1;
        this.test2 = test2;
    }

    /**
     * 商品id，同时也是商品编号
     */
    private Long gid;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品卖点
     */
    private String sell_Point;
    /**
     * 商品价格，单位为：分
     */
    private Long price;
    /**
     * 库存数量
     */
    private int num;
    /**
     * 商品条形码
     */
    private String barcode;
    /**
     * 商品图片
     */
    private String image;
    /**
     * 所属类目，叶子类目
     */
    private Long cid;
    /**
     * 商品状态，1-正常，2-下架，3-删除
     */
    private int status;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date updated;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSell_Point() {
        return sell_Point;
    }

    public void setSell_Point(String sell_Point) {
        this.sell_Point = sell_Point;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
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

