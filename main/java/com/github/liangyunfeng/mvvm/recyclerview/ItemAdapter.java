package com.github.liangyunfeng.mvvm.recyclerview;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.github.liangyunfeng.mvvm.R;
import com.github.liangyunfeng.mvvm.recyclerview.model.User;

import java.util.ArrayList;

import static com.github.liangyunfeng.mvvm.BR.user;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<User> mItems;

    public ItemAdapter(ArrayList<User> items) {
        mItems = items;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.recycler_view_item, viewGroup, false);
        ItemViewHolder holder = new ItemViewHolder(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder viewHolder, int i) {
        viewHolder.getBinding().setVariable(user, mItems.get(i));
        viewHolder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public ItemViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void setBinding(ViewDataBinding binding) {
            this.binding = binding;
        }

        public ViewDataBinding getBinding() {
            return this.binding;
        }
    }
}