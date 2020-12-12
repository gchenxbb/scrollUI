package com.ld.coordl.viewholder;

import android.view.View;

import com.ld.coordl.entity.Bean;
import com.ld.coordl.viewholder.BaseRecycleViewHolder;

/**
 *
 */
public class ImageViewHolder extends BaseRecycleViewHolder<Bean> implements View.OnClickListener {
    Bean data;

    public ImageViewHolder(View view) {
        super(view);
        mContext = view.getContext();
    }

    @Override
    public void setViewHolderData(Bean itemData, int position) {
        data = itemData;
    }

    @Override
    public void onClick(View v) {

    }
}