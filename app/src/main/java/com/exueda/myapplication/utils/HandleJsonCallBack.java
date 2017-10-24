package com.exueda.myapplication.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

import com.exueda.myapplication.bean.CommonBeanListener;
import com.exueda.myapplication.listener.CallListener;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by exueda on 2017/10/23.
 */

public class HandleJsonCallBack implements Callback {

    private CallListener callListener;

    private Handler handler;

    private Class<?> mclass;

    private final static String error="error";
    private final static String empty="null";

    public HandleJsonCallBack(CommonBeanListener commonBeanListener) {
        this.callListener = commonBeanListener.callListener;
        mclass=commonBeanListener.mclass;
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void onFailure(Call call, final IOException e) {

        handler.post(new Runnable() {
            @Override
            public void run() {

                callListener.onFailure(e.toString());

            }
        });
    }

    @Override
    public void onResponse(Call call, final Response response) throws IOException {

        final String string = response.body().string();

        handler.post(new Runnable() {
            @Override
            public void run() {

                handleResponse(string);

            }
        });

    }


    private void handleResponse(String string) {

        if (string!=null && !TextUtils.isEmpty(string)){

            Gson gson=new Gson();
            Object object=gson.fromJson(string,mclass);

            if (object==null){

                callListener.onFailure(empty);

            }else {

                callListener.onSuccess(object);
            }

        }else {

            callListener.onFailure(empty);
        }



    }
}
