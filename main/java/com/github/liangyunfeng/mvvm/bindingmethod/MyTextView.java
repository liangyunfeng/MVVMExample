package com.github.liangyunfeng.mvvm.bindingmethod;

import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.Toast;

@BindingMethods({@BindingMethod(type = TextView.class, attribute = "mytoast", method = "showMyToast")})
public class MyTextView extends TextView {

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void showMyToast(String s) {
        if (TextUtils.isEmpty(s)) {
            return;
        }

        Toast.makeText(getContext(), s, Toast.LENGTH_LONG).show();
    }
}
