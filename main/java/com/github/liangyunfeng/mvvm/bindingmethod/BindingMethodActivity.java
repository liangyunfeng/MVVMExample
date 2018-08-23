package com.github.liangyunfeng.mvvm.bindingmethod;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.bindingmethod.model.User;
import com.github.liangyunfeng.mvvm.databinding.ActivityBindingMethodBinding;

public class BindingMethodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityBindingMethodBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_method);
        User user = new User();
        binding.setUser(user);
    }
}


