package com.ld.coordl.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.ld.coordl.R;
import com.ld.coordl.entity.TitleEntry;

public class TitleViewHolder extends BaseRecycleViewHolder<TitleEntry> implements View.OnClickListener {
    private String TAG = "SubTitleViewHolder";

    private TextView item_tag_tv;

    public TitleViewHolder(View itemView) {
        super(itemView);
        item_tag_tv = (TextView) itemView.findViewById(R.id.item_tag_tv);
    }

    @Override
    public void setViewHolderData(TitleEntry object, int position) {
        if (!TextUtils.isEmpty(object.mTitle)) {
            item_tag_tv.setText(object.mTitle);
        }
    }

    @Override
    public void onClick(View v) {

    }
}
