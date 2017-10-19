package com.exueda.myapplication.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.exueda.myapplication.R;
import com.exueda.myapplication.bean.Bean;

import java.util.List;

/**
 * Created by exueda on 2017/10/19.
 */

public class HomeAdapter extends BaseQuickAdapter<Bean, BaseViewHolder> {

    private List<Bean> list;


    public HomeAdapter(@LayoutRes int layoutResId, @Nullable List<Bean> data) {
        super(layoutResId, data);

        this.list = data;
    }

    @Override
    protected void convert(BaseViewHolder helper, Bean item) {

        helper.setText(R.id.tv_num, item.getZhi())
                .addOnClickListener(R.id.tv_num)
                .addOnClickListener(R.id.cardView);

        helper.setImageResource(R.id.image, R.mipmap.ic_launcher_round);

    }
}
