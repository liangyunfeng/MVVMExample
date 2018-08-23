package com.github.liangyunfeng.mvvm.two_way_data_binding2;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.InverseBindingListener;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;

public class MySeekBar extends SeekBar {
    private static final String TAG = "MySeekBar";
    private static InverseBindingListener mInverseBindingListener;

    public MySeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //触发反向数据的传递
                Log.v(TAG, "onProgressChanged: progress = " + i);
                if (mInverseBindingListener != null) {
                    mInverseBindingListener.onChange();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    @BindingAdapter(value = "myprogress", requireAll = false)
    public static void setMyProgress(MySeekBar seekBar, int progress) {
        Log.v(TAG, "setMyProgress: progress = " + progress,new Exception());
        if (getMyProgress(seekBar) != progress) {
            seekBar.setProgress(progress);
        }
    }

    @InverseBindingAdapter(attribute = "myprogress", event = "myprogressAttrChanged")
    public static int getMyProgress(MySeekBar seekBar) {
        Log.v(TAG, "getMyProgress:",new Exception());
        return seekBar.getProgress();
    }

    @BindingAdapter(value = {"myprogressAttrChanged"}, requireAll = false)
    public static void setMyProgressAttrChanged(MySeekBar seekBar, InverseBindingListener inverseBindingListener) {
        Log.v(TAG, "setMyProgressAttrChanged:",new Exception());
        if (inverseBindingListener == null) {
            Log.e("错误！", "InverseBindingListener为空!");
        } else {
            mInverseBindingListener = inverseBindingListener;
        }
    }
}
