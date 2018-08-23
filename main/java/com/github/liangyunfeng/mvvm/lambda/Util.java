package com.github.liangyunfeng.mvvm.lambda;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.github.liangyunfeng.mvvm.lambda.model.User;

public class Util {
    public void onMyClick(User u, View view) {
        Log.d("按钮事件", u.content.get() + "");
        Toast.makeText(view.getContext(), u.content.get(), Toast.LENGTH_SHORT).show();
    }
}



