package com.github.liangyunfeng.mvvm.base.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import com.github.liangyunfeng.mvvm.BR;

public class User3 extends BaseObservable {
    private ObservableField<String> name;
    private ObservableInt age;
}

