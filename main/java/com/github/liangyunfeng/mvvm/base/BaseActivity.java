package com.github.liangyunfeng.mvvm.base;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.databinding.ActivityBaseBinding;
import com.github.liangyunfeng.mvvm.base.model.User;

public class BaseActivity extends AppCompatActivity {

    private final String str = "代码GG之家微信号\n" +
            "code_gg_home\n" +
            "欢迎关注！";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityBaseBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_base);

        final User user = new User();
        user.setName(str);
        user.setAge(28);
        binding.setUser(user);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                user.setAge(30);
            }
        },3000);

    }
}
