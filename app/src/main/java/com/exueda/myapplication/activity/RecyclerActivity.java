package com.exueda.myapplication.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.exueda.myapplication.R;
import com.exueda.myapplication.adapter.BaseRecyclerAdapter;
import com.exueda.myapplication.listener.RecyclerOnItemClickListener;
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

        reclycleView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        reclycleView.setItemAnimator(new DefaultItemAnimator());


        setAdapter();
        setListener();

    }

    private void setAdapter() {
        recyclerAdapter = new BaseRecyclerAdapter(CommonUtils.getData(), context);
        reclycleView.setAdapter(recyclerAdapter);
    }

    private void setListener() {
        recyclerAdapter.setRecyclerOnItemClickListener(new RecyclerOnItemClickListener() {

            @Override
            public void onItemclick(View view, int position) {

                Toast.makeText(context,"-----"+position+"----",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
