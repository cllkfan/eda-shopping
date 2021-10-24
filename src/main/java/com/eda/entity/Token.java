package com.eda.entity;

import java.io.Serializable;

/**
 * (Token)实体类
 *
 * @author makejava
 * @since 2021-10-23 19:25:19
 */
public class Token implements Serializable {
    private static final long serialVersionUID = 533826142150591893L;

    public Token() {
    }

    public Token(int tk_status, String tk_message, String username) {
        this.tk_status = tk_status;
        this.tk_message = tk_message;
        this.username = username;
    }

    public Token(int tk_id, int tk_status, String tk_message, String username, String test1, String test2) {
        this.tk_id = tk_id;
        this.tk_status = tk_status;
        this.tk_message = tk_message;
        this.username = username;
        this.test1 = test1;
        this.test2 = test2;
    }

    private int tk_id;

    private int tk_status;

    private String tk_message;

    private String username;

    private String test1;

    private String test2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTk_id() {
        return tk_id;
    }

    public void setTk_id(int tk_id) {
        this.tk_id = tk_id;
    }

    public int getTk_status() {
        return tk_status;
    }

    public void setTk_status(int tk_status) {
        this.tk_status = tk_status;
    }

    public String getTk_message() {
        return tk_message;
    }

    public void setTk_message(String tk_message) {
        this.tk_message = tk_message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

