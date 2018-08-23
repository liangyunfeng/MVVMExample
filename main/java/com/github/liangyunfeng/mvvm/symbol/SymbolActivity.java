package com.github.liangyunfeng.mvvm.symbol;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.databinding.ActivitySymbolBinding;
import com.github.liangyunfeng.mvvm.symbol.model.User;

/**
 * 在过去的Android开发中，假设一个简单的应用开发需求，垂直线性布局上面一个EditText，下面一个TextView，TexView要实时的回显EditText的显示内容，
 * 一般的做法就是给EditText增加一个监听器（addTextChangedListener），这里面构造一个TextWatcher，然后在TextWatcher里面把EditText的内容实时更新回显到TextView中。
 * <p>
 * 而现在，有了Android DataBinding技术，则仅需几行代码一个符号’ @= ’就搞定这些操作。
 * 给出一个例子。
 * <p>
 * android:text="@={user.content}"  是把View的内容更新到user.content变量里面，
 * 而android:text="@{user.content}" 是把user.content变量中的内容显示到text中去
 */
public class SymbolActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivitySymbolBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_symbol);
        User user = new User();
        binding.setUser(user);
    }
}



