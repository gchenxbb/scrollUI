package com.ld.coordl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ld.coordl.adapter.BuAdapter;
import com.ld.coordl.entity.ExpendItemEntity;
import com.ld.coordl.entity.ItemEntry;
import com.ld.coordl.entity.Type3Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * demo
 */
public class SingleRecyclerActivity extends AppCompatActivity {
    private List<ItemEntry> mDataList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    BuAdapter buAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_recyclerview);


        mRecyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        initData();
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            ItemEntry<Type3Entity> item = new ItemEntry();
            item.data = new Type3Entity("item" + i);
            item.floorType = FloorType.ITEM_TYPE_3;
            mDataList.add(item);
        }

        ItemEntry<ExpendItemEntity> itemEntry4 = new ItemEntry();
        itemEntry4.data = new ExpendItemEntity();
        itemEntry4.floorType = FloorType.ITEM_TYPE_4;
        mDataList.add(0, itemEntry4);

        buAdapter = new BuAdapter(this, mDataList);
        mRecyclerView.setAdapter(buAdapter);
    }
}