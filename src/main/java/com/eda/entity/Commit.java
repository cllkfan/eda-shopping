package com.eda.entity;

import java.io.Serializable;

/**
 * (Commit)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:09
 */
public class Commit implements Serializable {
    private static final long serialVersionUID = -91931955149413472L;

    public Commit() {
    }

    public Commit(int com_id, String com_message, String com_nick, int com_rate, String test1, String test2) {
        this.com_id = com_id;
        this.com_message = com_message;
        this.com_nick = com_nick;
        this.com_rate = com_rate;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int com_id;

    private String com_message;

    private String com_nick;

    private int com_rate;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public String getCom_message() {
        return com_message;
    }

    public void setCom_message(String com_message) {
        this.com_message = com_message;
    }

    public String getCom_nick() {
        return com_nick;
    }

    public void setCom_nick(String com_nick) {
        this.com_nick = com_nick;
    }

    public int getCom_rate() {
        return com_rate;
    }

    public void setCom_rate(int com_rate) {
        this.com_rate = com_rate;
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

