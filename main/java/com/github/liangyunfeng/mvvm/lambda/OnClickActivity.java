package com.github.liangyunfeng.mvvm.lambda;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.databinding.ActivityOnClickBinding;
import com.github.liangyunfeng.mvvm.lambda.model.User;

public class OnClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityOnClickBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_on_click);

        User user = new User();
        binding.setUser(user);
        Util util = new Util();
        binding.setUtil(util);
    }
}


