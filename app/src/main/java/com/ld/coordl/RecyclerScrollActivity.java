package com.ld.coordl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ld.coordl.adapter.BuAdapter;
import com.ld.coordl.entity.Bean;
import com.ld.coordl.entity.ExpendItemEntity;
import com.ld.coordl.entity.ItemEntry;
import com.ld.coordl.entity.MoreViewEntry;
import com.ld.coordl.entity.Type3Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * demo
 */
public class RecyclerScrollActivity extends AppCompatActivity {
    private List<ItemEntry> mTopDataList = new ArrayList<>();
    private List<ItemEntry> mDataList = new ArrayList<>();
    private RecyclerView mTopRecyclerView;
    private RecyclerView mRecyclerView;
    BuAdapter buAdapter;
    BuAdapter topAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_scrolling);

        mTopRecyclerView = findViewById(R.id.recyclerview_top);
        mRecyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager topLinearLayoutManager = new LinearLayoutManager(this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 3);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mTopRecyclerView.setLayoutManager(topLinearLayoutManager);
        initData();
    }

    private void initData() {
        //top
        ItemEntry<MoreViewEntry> itemsEntry = new ItemEntry();
        itemsEntry.data = new MoreViewEntry();
        itemsEntry.floorType = FloorType.ITEM_TYPE_1;
        mTopDataList.add(itemsEntry);

        ItemEntry<Bean> itemsEntry2 = new ItemEntry();
        itemsEntry2.data = new Bean();
        itemsEntry2.floorType = FloorType.ITEM_TYPE_2;
        mTopDataList.add(itemsEntry2);

        ItemEntry<Type3Entity> itemsEntry3 = new ItemEntry();
        itemsEntry3.data = new Type3Entity("item");
        itemsEntry3.floorType = FloorType.ITEM_TYPE_3;
        mTopDataList.add(itemsEntry3);

        topAdapter = new BuAdapter(this, mTopDataList);
        mTopRecyclerView.setAdapter(topAdapter);

        //content
        for (int i = 0; i < 10; i++) {
            ItemEntry<Type3Entity> itemsEntry0 = new ItemEntry();
            itemsEntry0.data = new Type3Entity("item" + i);
            itemsEntry0.floorType = FloorType.ITEM_TYPE_3;
            mDataList.add(itemsEntry0);
        }

        ItemEntry<ExpendItemEntity> itemEntry4 = new ItemEntry();
        itemEntry4.data = new ExpendItemEntity();
        itemEntry4.floorType = FloorType.ITEM_TYPE_4;
        mDataList.add(0, itemEntry4);

        buAdapter = new BuAdapter(this, mDataList);
        mRecyclerView.setAdapter(buAdapter);
    }

}