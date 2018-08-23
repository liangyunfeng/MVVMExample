package com.github.liangyunfeng.mvvm.base.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.github.liangyunfeng.mvvm.BR;

public class User2 extends BaseObservable {
    private String name;
    private int age;

    public User2() {

    }

    public User2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Bindable
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public int getAge() {
        return age;
    }

    @Bindable
    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
