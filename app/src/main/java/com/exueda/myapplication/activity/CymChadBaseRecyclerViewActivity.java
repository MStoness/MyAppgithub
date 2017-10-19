package com.exueda.myapplication.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.exueda.myapplication.R;
import com.exueda.myapplication.adapter.DragAdapter;
import com.exueda.myapplication.adapter.HomeAdapter;
import com.exueda.myapplication.utils.CommonUtils;

/**
 * 出自http://www.jianshu.com/p/b343fcff51b0
 * 很好用的第三方
 */
public class CymChadBaseRecyclerViewActivity extends Activity {

    private Context context;

    private RecyclerView cyreclycleView;

    private HomeAdapter homeAdapter;

    private DragAdapter dragAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_recycler_view);
        context=CymChadBaseRecyclerViewActivity.this;

        cyreclycleView= (RecyclerView) findViewById(R.id.CyreclycleView);
        GridLayoutManager manager=new GridLayoutManager(context,3);
        cyreclycleView.setLayoutManager(manager);
//        cyreclycleView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));

//        homeAdapter();


        dragAdapter();


    }

    private void dragAdapter() {
        dragAdapter=new DragAdapter(R.layout.item_relcycler, CommonUtils.getBeanData());

        ItemDragAndSwipeCallback itemDragAndSwipeCallback=new ItemDragAndSwipeCallback(dragAdapter);
        ItemTouchHelper itemTouchHelper=new ItemTouchHelper(itemDragAndSwipeCallback);
        itemTouchHelper.attachToRecyclerView(cyreclycleView);


        OnItemDragListener onItemDragListener=new OnItemDragListener() {
            @Override
            public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int pos) {

            }

            @Override
            public void onItemDragMoving(RecyclerView.ViewHolder source, int from, RecyclerView.ViewHolder target, int to) {

            }

            @Override
            public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int pos) {

            }
        };

        dragAdapter.enableDragItem(itemTouchHelper);//开启拖动
        dragAdapter.setOnItemDragListener(onItemDragListener);
        cyreclycleView.setAdapter(dragAdapter);


        dragAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                Toast.makeText(context,position+"====item子view的点击",Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void homeAdapter() {
        homeAdapter=new HomeAdapter(R.layout.item_relcycler, CommonUtils.getBeanData());
        cyreclycleView.setAdapter(homeAdapter);

        homeAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        homeAdapter.isFirstOnly(false);//显示动画多次


        View headView= LayoutInflater.from(context).inflate(R.layout.headview,null);
        homeAdapter.addHeaderView(headView);

        homeAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                Toast.makeText(context,"item的点击",Toast.LENGTH_SHORT).show();

            }
        });

        homeAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

                int id = view.getId();
                switch (id){

                    case R.id.cardView:

                        Toast.makeText(context,position+"====item子view--cardView的点击",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tv_num:

                        Toast.makeText(context,"item子view---tv_num的点击",Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}
