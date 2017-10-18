package com.exueda.myapplication.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.exueda.myapplication.R;
import com.exueda.myapplication.adapter.BaseRecyclerAdapter;
import com.exueda.myapplication.utils.CommonUtils;

public class RecyclerActivity extends Activity {

    private RecyclerView reclycleView;

    private BaseRecyclerAdapter recyclerAdapter;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        context=RecyclerActivity.this;


        reclycleView = (RecyclerView) findViewById(R.id.reclycleView);

        reclycleView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        recyclerAdapter = new BaseRecyclerAdapter(CommonUtils.getData(), context);
        reclycleView.setAdapter(recyclerAdapter);
    }
}
