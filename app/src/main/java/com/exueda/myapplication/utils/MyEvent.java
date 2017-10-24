package com.exueda.myapplication.utils;

/**
 * Created by exueda on 2017/10/20.
 * 是一个唯一标识（暂时知道这些）
 */

public class MyEvent {


    private String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
