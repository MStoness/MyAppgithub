package com.exueda.myapplication.adapter;

import android.view.LayoutInflater;

import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.exueda.myapplication.R;
import com.exueda.myapplication.bean.Bean;

import java.util.List;

/**
 * Created by exueda on 2017/10/19.
 */

public class DragAdapter extends BaseItemDraggableAdapter<Bean, BaseViewHolder> {


    public DragAdapter(int layoutResId, List<Bean> data) {
        super(layoutResId, data);


    }

    @Override
    protected void convert(BaseViewHolder helper, Bean item) {

        helper.setText(R.id.tv_num,item.getZhi());

    }
}
