package com.exueda.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.exueda.myapplication.R;

import java.util.List;

/**
 * Created by exueda on 2017/10/17.
 */

public class BaseRecyclerAdapter extends RecyclerView.Adapter<BaseRecyclerAdapter.MyViewHolder> {


    private List<String> data;

    private Context context;

    public BaseRecyclerAdapter(List<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutInflater = LayoutInflater.from(context).inflate(R.layout.item_relcycler, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(layoutInflater);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        String s = data.get(position);
        holder.textView.setText(s);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.tv_num);
        }
    }
}
