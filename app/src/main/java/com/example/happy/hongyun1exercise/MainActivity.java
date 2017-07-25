package com.example.happy.hongyun1exercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.RadioGroup;

import com.youth.banner.Banner;

public class MainActivity extends AppCompatActivity {

    private Banner mBannerMain;
    private RecyclerView mRecyclerviewMain;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBannerMain = (Banner) findViewById(R.id.banner_main);
        mRecyclerviewMain = (RecyclerView) findViewById(R.id.recyclerview_main);
        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }
}
