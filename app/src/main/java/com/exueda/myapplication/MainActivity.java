package com.exueda.myapplication;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;

import com.exueda.myapplication.adapter.BaseRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    Button button;

    private ImageView iv;

    private RecyclerView reclycleView;

    private BaseRecyclerAdapter recyclerAdapter;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        reclycleView = (RecyclerView) findViewById(R.id.reclycleView);

        reclycleView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        recyclerAdapter = new BaseRecyclerAdapter(getData(), context);
        reclycleView.setAdapter(recyclerAdapter);

    }


    private List<String> getData() {

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            stringList.add(i + "haha");
        }

        return stringList;
    }

}
