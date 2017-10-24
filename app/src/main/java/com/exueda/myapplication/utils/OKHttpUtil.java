package com.exueda.myapplication.utils;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by exueda on 2017/10/23.
 */

public class OKHttpUtil {

    private OkHttpClient okHttpClient;

    public OKHttpUtil() {

        okHttpClient = new OkHttpClient();
    }


    /**
     * 同步get
     *
     * @param url
     * @return
     */
    public String get(String url) {


        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = okHttpClient.newCall(request).execute();

            if (response.isSuccessful()) {

                return response.body().string();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }


    /**
     * 异步get
     *
     * @param url
     * @return
     */
    public void enqueue_get(String url, HandleJsonCallBack listener) {


        Request request = new Request.Builder()
                .url(url)
                .build();

        okHttpClient.newCall(request).enqueue(listener);


    }


    /**
     *
     * @param url
     * @param jsonObject
     * @param listener
     */
    public void enquenue_post(String url, JSONObject jsonObject,HandleJsonCallBack listener) {

        MediaType parse = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = RequestBody.create(parse, jsonObject.toString());

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        okHttpClient.newCall(request).enqueue(listener);

    }


}
