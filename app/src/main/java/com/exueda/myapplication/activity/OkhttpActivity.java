package com.exueda.myapplication.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.exueda.myapplication.R;
import com.exueda.myapplication.bean.CommonBeanListener;
import com.exueda.myapplication.bean.GankBean;
import com.exueda.myapplication.listener.CallListener;
import com.exueda.myapplication.utils.HandleJsonCallBack;
import com.exueda.myapplication.utils.OKHttpUtil;


public class OkhttpActivity extends Activity implements View.OnClickListener {

    private Button get, enqueue_get;
    private TextView text;

    private OKHttpUtil okHttpUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp);

        findId();

        okHttpUtil = new OKHttpUtil();


    }

    private void findId() {
        enqueue_get = (Button) findViewById(R.id.enqueue_get);
        get = (Button) findViewById(R.id.get);
        text = (TextView) findViewById(R.id.text);
        enqueue_get.setOnClickListener(this);
        get.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.get:

                break;

            case R.id.enqueue_get:
                enqueueGetClick();


                break;
        }
    }



    private void enqueueGetClick() {
        //干货集中营的api
        okHttpUtil.enqueue_get("http://gank.io/api/data/Android/10/1",
                new HandleJsonCallBack(new CommonBeanListener(GankBean.class,new CallListener<GankBean>(){

                    @Override
                    public void onSuccess(GankBean bean) {

                        text.setText(bean.getResults().get(0).get_id()+"");

                    }

                    @Override
                    public void onFailure(String message) {

                        text.setText(message);

                    }
                })));
    }

}
