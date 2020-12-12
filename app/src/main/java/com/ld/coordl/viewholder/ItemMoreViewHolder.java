package com.ld.coordl.viewholder;

import android.view.View;

import com.ld.coordl.entity.MoreViewEntry;


public class ItemMoreViewHolder extends BaseRecycleViewHolder<MoreViewEntry> implements View.OnClickListener {
    MoreViewEntry moreViewEntry;

    public ItemMoreViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void setViewHolderData(MoreViewEntry object, int position) {
        moreViewEntry = object;
    }

    @Override
    public void onClick(View v) {

        if (moreViewEntry.moreClickListener != null) {
            moreViewEntry.moreClickListener.onMoreClick(null);
        }
    }
}
