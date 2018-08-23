package com.github.liangyunfeng.mvvm.two_way_data_binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.databinding.ActivityTwoWayDataBindingBinding;

public class TwoWayDataBindingActivity extends AppCompatActivity {
    private final String TAG = "TwoWayDataBinding";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityTwoWayDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_data_binding);
        final ViewModel vm = new ViewModel();
        binding.setModel(vm);

        //数据模型的变化将控制View的显示
        vm.isDisplay.set(false);

        //Log.d(TAG, "数值变化:" + vm.isDisplay.get());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        binding.myview.setVisibility(View.VISIBLE);
                        //View的变化结果，值将回写到ViewModel的isDisplay中
                        //Log.d(TAG, "数值变化:" + vm.isDisplay.get());
                    }
                });
            }
        }).start();
    }
}
