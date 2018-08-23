package com.github.liangyunfeng.mvvm.base.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.github.liangyunfeng.mvvm.BR;

public class User extends BaseObservable {

    @Bindable
    private String name;

    @Bindable
    private int age;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
