package com.github.liangyunfeng.mvvm.bindingadapter.model;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class User extends BaseObservable {
    public final ObservableInt id = new ObservableInt();
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> url = new ObservableField<>();
}


