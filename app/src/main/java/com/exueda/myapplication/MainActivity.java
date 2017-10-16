package com.exueda.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;

import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.youth.banner.Banner;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private final String TAG2 = "H";

    BridgeWebView webView;

    Button button;

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


    }
}
