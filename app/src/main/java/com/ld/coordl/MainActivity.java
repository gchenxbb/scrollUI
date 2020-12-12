package com.ld.coordl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ld.coordl.adapter.RecycleAdapter;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * demo
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private TextView iv_add;
    private RecycleAdapter adapter;
    private List<String> list = new ArrayList<String>();

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initRecycle();
        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //              添加自带默认动画


                if (i == 0) {
                    adapter.addData(0);
                    i++;
                } else if (i == 1) {
                    list = initData();
                    adapter.addData(list);
                    mRecyclerView.post(new Runnable() {
                        @Override
                        public void run() {
                            adapter.addData(0);
                        }
                    });
                }
            }
        });
    }

    private void initRecycle() {
        //  纵向滑动
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
//      获取数据，向适配器传数据，绑定适配器
        list = initData();
        adapter = new RecycleAdapter(MainActivity.this, list);
        mRecyclerView.setAdapter(adapter);
//      添加动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void initView() {
        iv_add = (TextView) findViewById(R.id.iv_add);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    protected ArrayList<String> initData() {
        ArrayList<String> mDatas = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            mDatas.add("我是商品" + i);
        }
        return mDatas;
    }
}