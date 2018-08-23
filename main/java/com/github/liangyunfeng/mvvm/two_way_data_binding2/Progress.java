package com.github.liangyunfeng.mvvm.two_way_data_binding2;

import android.databinding.BaseObservable;
import android.databinding.ObservableInt;

public class Progress  extends BaseObservable {
    public final ObservableInt porgress = new ObservableInt();
}



