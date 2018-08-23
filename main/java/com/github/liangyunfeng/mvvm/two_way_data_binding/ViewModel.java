package com.github.liangyunfeng.mvvm.two_way_data_binding;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;

public class ViewModel extends BaseObservable {
    public final ObservableBoolean isDisplay = new ObservableBoolean();
}



