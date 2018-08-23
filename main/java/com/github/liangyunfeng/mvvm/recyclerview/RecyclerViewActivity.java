package com.github.liangyunfeng.mvvm.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.recyclerview.model.User;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private int index = 0;
    private ItemAdapter mItemAdapter;
    private ArrayList<User> mItems;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mItems = new ArrayList();

        for (int i = 0; i < 1; i++) {
            User u = new User();
            u.setId(index + "");
            u.setName("liangyunfeng @" + index);
            u.setBlog("blog.csdn.net/liangyunfeng @" + index);
            mItems.add(u);
            index++;
        }

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mItemAdapter = new ItemAdapter(mItems);
        mRecyclerView.setAdapter(mItemAdapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User u = new User();
                u.setId(index + "");
                u.setName("liangyunfeng @" + index);
                u.setBlog("blog.csdn.net/liangyunfeng @" + index);
                mItems.add(u);
                mItemAdapter.notifyDataSetChanged();
                index++;
            }
        });
    }
}