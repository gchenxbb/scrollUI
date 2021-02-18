package com.ld.coordl.touch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ld.coordl.R;


/**
 *
 */
public class MotionEventActivity extends AppCompatActivity {

    ChenLinearLayout motionEventLinearLayout;
    TextView mTv1;
    ChenTextView mTv2;
    TextView mTv0;

    protected void initView() {
        motionEventLinearLayout = findViewById(R.id.motionEventLinear);
        mTv1 = findViewById(R.id.tv_1);
        mTv2 = findViewById(R.id.tv_2);
        mTv0 = findViewById(R.id.tv_0);

        motionEventLinearLayout.setClickable(true);
        mTv0.setClickable(true);
        mTv1.setClickable(true);
        mTv2.setClickable(true);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_motion_event);
        initView();
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MotionEventActivity.this, "tv1", Toast.LENGTH_LONG).show();
            }
        });
        mTv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MotionEventActivity.this, "tv2", Toast.LENGTH_LONG).show();
            }
        });
        mTv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MotionEventActivity.this, "tv0", Toast.LENGTH_LONG).show();
            }
        });
    }


}
