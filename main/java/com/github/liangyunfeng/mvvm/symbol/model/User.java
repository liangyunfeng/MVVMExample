package com.github.liangyunfeng.mvvm.symbol.model;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

public class User extends BaseObservable {
    public final ObservableField<String> content = new ObservableField<>();
}



