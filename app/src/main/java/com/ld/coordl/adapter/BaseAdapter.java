package com.ld.coordl.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.ld.coordl.viewholder.BaseRecycleViewHolder;
import com.ld.coordl.entity.ItemEntry;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BaseAdapter extends RecyclerView.Adapter<BaseRecycleViewHolder> {
    protected Context mContext;
    protected List<ItemEntry> mDataList = new ArrayList<>();
    protected int mDataTotal;

    public BaseAdapter(Context context, List<ItemEntry> dataList) {
        mContext = context;
        mDataList = dataList;
        mDataTotal = 0;
    }

    @Override
    public BaseRecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BaseRecycleViewHolder holder, int i) {
    }

    @Override
    public int getItemCount() {
        if (mDataList == null) {
            mDataTotal = 0;
            return 0;
        }
        mDataTotal = mDataList.size();
        return mDataTotal;
    }

    @Override
    public int getItemViewType(int position) {
        if (mDataList != null && mDataList.size() > position && position >= 0) {
            return mDataList.get(position).floorType.ordinal();
        } else {
            return super.getItemViewType(position);
        }
    }

    /**
     * 添加分割线
     * 不需要自动添加分割线
     *
     * @param data
     */
    public void addData(ItemEntry data) {
        if (mDataList == null) {
            return;
        }

        int total = mDataList.size();

        if (total == 0) {
            return;
        }
    }

    public void removeLastView() {
        if (mDataList == null) {
            return;
        }
        if (mDataList.size() == 0) {
            return;
        }
        mDataList.remove(mDataList.size() - 1);
        notifyItemRemoved(mDataList.size() - 1);
    }

    /**
     * 清空所有的搜索结果
     */
    public void clearAllData() {
        if (mDataList != null && mDataList.size() != 0) {
            mDataList.clear();
        }
        mDataTotal = 0;
        notifyDataSetChanged();
    }
}