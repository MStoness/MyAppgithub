package com.exueda.myapplication.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.exueda.myapplication.R;
import com.exueda.myapplication.utils.MyEvent;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends Activity {

    private Button btn_post;

    private String message;

    private String aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btn_post = (Button) findViewById(R.id.btn_post);
        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                netWork();
                finish();

            }
        });


    }


    private void netWork() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);//模拟耗时操作

                    message = "hello";

                    EventBus.getDefault().post(new MyEvent(message));


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
