package com.github.liangyunfeng.mvvm.lambda.model;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

public class User extends BaseObservable {
    public final ObservableField<String> content = new ObservableField<>();
}



