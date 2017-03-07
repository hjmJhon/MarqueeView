package com.example.marqueeviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.marqueeview.MarqueeView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> data;
    private MarqueeView mMarqueeView;
    private MarqueeView mMarqueeView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMarqueeView = (MarqueeView) findViewById(R.id.marqueeView);
        mMarqueeView2 = (MarqueeView) findViewById(R.id.marqueeView2);

        initData();

        mMarqueeView.setData(data);
        mMarqueeView2.setData(data);
    }

    private void initData() {
        data = new ArrayList<>();
        data.add("最近很忙...");
        data.add("心里窝火...");
        data.add("就把项目中这个小功能开源了..");
        data.add("特点:只创建两个TextView!");
    }

    public void stop(View view) {
        mMarqueeView.toggleFlip();
    }

    public void stop2(View view) {
        mMarqueeView.stop();
    }
}
