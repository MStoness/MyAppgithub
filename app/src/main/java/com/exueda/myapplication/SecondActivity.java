package com.exueda.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Toast.makeText(this, "Bean.getZhi():" + Bean.getZhi(), Toast.LENGTH_SHORT).show();
    }
}
