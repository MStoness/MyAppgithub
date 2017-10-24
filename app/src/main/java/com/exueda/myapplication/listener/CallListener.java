package com.exueda.myapplication.listener;

/**
 * Created by exueda on 2017/10/13.
 */

public interface CallListener<T> {

    void onSuccess(T bean);
    void onFailure(String message);
}
