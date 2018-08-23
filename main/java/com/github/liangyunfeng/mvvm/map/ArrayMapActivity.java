package com.github.liangyunfeng.mvvm.map;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.databinding.ActivityArrayMapBinding;
import com.github.liangyunfeng.mvvm.map.model.User;

public class ArrayMapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityArrayMapBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_array_map);
        final User user = new User();
        binding.setUser(user);
        user.id.set(0);
        user.name.set("liangyunfeng");
        user.quality.put("normal", "N url");
        user.quality.put("high", "H url");
        user.quality.put("super", "S url");
        user.current.set("normal");
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.id.set(1);
                user.quality.put("high", "new H url");
                user.current.set("high");
            }
        });
    }
}
