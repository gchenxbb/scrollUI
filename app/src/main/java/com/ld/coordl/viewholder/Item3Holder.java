package com.ld.coordl.viewholder;

import android.view.View;
import android.widget.TextView;

import com.ld.coordl.R;
import com.ld.coordl.entity.Type3Entity;

/**
 *
 */
public class Item3Holder extends BaseRecycleViewHolder<Type3Entity> implements View.OnClickListener {
    protected Type3Entity viewHolderData;
    private TextView textView;

    public Item3Holder(View view) {
        super(view);
        mContext = view.getContext();

        textView = view.findViewById(R.id.tv_item);
    }

    @Override
    public void setViewHolderData(Type3Entity itemData, int position) {
        viewHolderData = itemData;
        textView.setText(itemData.text);

    }

    @Override
    public void onClick(View v) {

    }
}