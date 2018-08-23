package com.github.liangyunfeng.mvvm.two_way_data_binding2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.databinding.ActivityProgressBinding;

public class ProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProgressBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_progress);
        Progress progress = new Progress();
        Log.v("ProgressActivity", "onCreate");
        binding.setProgress(progress);
        //设置一个初始值作为演示 数据 -> View
        //这是最常见的进度设置。
        progress.porgress.set(21);
    }
}



