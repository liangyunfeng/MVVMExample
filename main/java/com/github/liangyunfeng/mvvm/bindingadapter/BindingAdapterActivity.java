package com.github.liangyunfeng.mvvm.bindingadapter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.bindingadapter.model.User;
import com.github.liangyunfeng.mvvm.databinding.ActivityBindingAdapterBinding;

public class BindingAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingAdapterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter);

        User user = new User();
        binding.setUser(user);

        user.id.set(1);
        user.name.set("liangyunfeng");
        user.url.set("https://www.baidu.com/img/bd_logo1.png");
    }
}
