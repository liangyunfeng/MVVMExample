package com.github.liangyunfeng.mvvm.bindingadapter.adapter;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestOptions;
import com.github.liangyunfeng.mvvm.R;

/**
 * 在任何一个类里面定义都可以，
 * 只要在方法前面加注解@BindingAdapter({"imageUrl"}),
 * imageUrl的名字要完全对应xml布局文件中使用的app:imageUrl="@{user.url}"的名字，
 * 而且，参数要接收两个形参ImageView和String，
 * 这样，当调用user.url.set("https://www.baidu.com/img/bd_logo1.png");时，
 * 就会自动找到这个BindingAdapter的方法并调用
 */
public class Util {

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String url) {
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .diskCacheStrategy(DiskCacheStrategy.NONE);

        Glide.with(view.getContext()).applyDefaultRequestOptions(options).load(url).transition(new DrawableTransitionOptions().crossFade(1000)).into(view);
    }

}
