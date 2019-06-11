package com.exueda.myapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.exueda.myapplication.R;
import com.exueda.myapplication.utils.MyEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private final String TAG = "MainActivity";

    private Button simple_recyclerViewbtn, cymChadBaseRecyclerView, eventBus,okhttp;

    private TextView showText;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        findId();



        


    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getMessage(MyEvent myEvent) {

        String message = myEvent.getMessage();

        showText.setText(message);

    }

    private void findId() {

        simple_recyclerViewbtn = (Button) findViewById(R.id.simple_recyclerView);
        cymChadBaseRecyclerView = (Button) findViewById(R.id.CymChadBaseRecyclerView);
        showText = (TextView) findViewById(R.id.showText);
        okhttp = (Button) findViewById(R.id.okhttp);
        eventBus = (Button) findViewById(R.id.eventBus);
        simple_recyclerViewbtn.setOnClickListener(this);
        cymChadBaseRecyclerView.setOnClickListener(this);
        eventBus.setOnClickListener(this);
        okhttp.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.simple_recyclerView:

                Intent intent = new Intent(context, RecyclerActivity.class);
                startActivity(intent);


                break;

            case R.id.CymChadBaseRecyclerView:

                Intent intent2 = new Intent(context, CymChadBaseRecyclerViewActivity.class);
                startActivity(intent2);


                break;
            case R.id.eventBus:

                Intent intent3 = new Intent(context, SecondActivity.class);
                startActivity(intent3);


                break;
            case R.id.okhttp:

                Intent intent4 = new Intent(context, OkhttpActivity.class);
                startActivity(intent4);


                break;

        }
    }
}
