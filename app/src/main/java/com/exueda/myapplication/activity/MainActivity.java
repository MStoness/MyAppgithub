package com.exueda.myapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.exueda.myapplication.R;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "MainActivity";

    private Button simple_recyclerViewbtn,cymChadBaseRecyclerView;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        findId();


    }

    private void findId() {

        simple_recyclerViewbtn = (Button) findViewById(R.id.simple_recyclerView);
        cymChadBaseRecyclerView = (Button) findViewById(R.id.CymChadBaseRecyclerView);
        simple_recyclerViewbtn.setOnClickListener(this);
        cymChadBaseRecyclerView.setOnClickListener(this);
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

        }
    }
}
