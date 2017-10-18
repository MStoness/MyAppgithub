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

    private Button simple_recyclerViewbtn;

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
        simple_recyclerViewbtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.simple_recyclerView:

                Intent intent = new Intent(context, RecyclerActivity.class);
                startActivity(intent);


                break;

        }
    }
}
