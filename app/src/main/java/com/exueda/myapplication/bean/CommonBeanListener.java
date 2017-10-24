package com.exueda.myapplication.bean;

import com.exueda.myapplication.listener.CallListener;

/**
 * Created by exueda on 2017/10/24.
 */

public class CommonBeanListener {

    public Class<?> mclass;

    public CallListener callListener;

    public CommonBeanListener(Class<?> mclass, CallListener callListener) {
        this.mclass = mclass;
        this.callListener = callListener;
    }
}
