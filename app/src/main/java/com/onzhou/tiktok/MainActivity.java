package com.onzhou.tiktok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
    }

    private void setupView() {
        mRecycleView = (RecyclerView) findViewById(R.id.recycle_cover);
        mRecycleView.setLayoutManager(new GridLayoutManager(this, 2));
        //mRecycleView.addItemDecoration(new GridItemDecoration());
        mRecycleView.setAdapter(new VideoPlayAdapter());
    }

}
