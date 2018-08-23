package com.github.liangyunfeng.mvvm.map.model;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ObservableMap;

public class User extends BaseObservable {
    public final ObservableInt id = new ObservableInt();
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableMap<String, Object> quality = new ObservableArrayMap<>();
    public final ObservableField<String> current = new ObservableField<>();
}
