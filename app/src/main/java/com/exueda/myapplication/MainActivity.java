package com.exueda.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.github.lzyzsd.jsbridge.BridgeHandler;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.CallBackFunction;
import com.github.lzyzsd.jsbridge.DefaultHandler;
import com.google.gson.Gson;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private final String TAG2 = "H";

    BridgeWebView webView;

    Button button;

    int RESULT_CODE = 0;

    ValueCallback<Uri> mUploadMessage;

    static class Location {
        String address;
    }

    static class User {
        String name;
        Location location;
        String testStr;
    }

    private ImageView iv;
    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        webView = (BridgeWebView) findViewById(R.id.webView);
//        iv = (ImageView) findViewById(R.id.iv);
//
//        button = (Button) findViewById(R.id.button);
//        banner = (Banner) findViewById(R.id.banner);

//        WebSettings settings = webView.getSettings();
//
//        settings.setJavaScriptEnabled(true);
//
////        webView.setDefaultHandler(new DefaultHandler());
////
////        webView.setWebChromeClient(new WebChromeClient());
//
//        webView.loadUrl("http://www.idui1.cn/bridge.html");
//
//        webView.registerHandler("submitFromWeb", new BridgeHandler() {
//
//            @Override
//            public void handler(String data, CallBackFunction function) {
//                Log.i(TAG, "=======handler = submitFromWeb, data from web = " + data);
////                function.onCallBack("submitFromWeb exe, response data 中文 from Java");
//            }
//
//        });

//        List<String> images=new ArrayList<>();
//
//        images.add("http://www.idui1.cn/images/banner/gaokao2017.jpg");
//        images.add("http://www.idui1.cn/images/banner/shuqi2017.png");
//        images.add("http://www.idui1.cn/images/banner/kaoqianquantikecheng.png");
//        images.add("http://www.idui1.cn/images/banner/gaokaochongcikecheng.jpg");
//
//        //设置图片加载器
//        banner.setImageLoader(new GlideImageLoader());
//        //设置图片集合
//        banner.setImages(images);
//        //banner设置方法全部调用完毕时最后调用
//        banner.start();



    }
}
