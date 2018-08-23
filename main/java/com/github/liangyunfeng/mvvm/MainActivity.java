package com.github.liangyunfeng.mvvm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.liangyunfeng.mvvm.base.BaseActivity;
import com.github.liangyunfeng.mvvm.bindingadapter.BindingAdapterActivity;
import com.github.liangyunfeng.mvvm.bindingmethod.BindingMethodActivity;
import com.github.liangyunfeng.mvvm.lambda.OnClickActivity;
import com.github.liangyunfeng.mvvm.map.ArrayMapActivity;
import com.github.liangyunfeng.mvvm.recyclerview.RecyclerViewActivity;
import com.github.liangyunfeng.mvvm.symbol.SymbolActivity;
import com.github.liangyunfeng.mvvm.two_way_data_binding.TwoWayDataBindingActivity;
import com.github.liangyunfeng.mvvm.two_way_data_binding2.ProgressActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Intent intent1 = new Intent(MainActivity.this, BaseActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn3:
                Intent intent3 = new Intent(MainActivity.this, BindingAdapterActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn4:
                Intent intent4 = new Intent(MainActivity.this, ArrayMapActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn5:
                Intent intent5 = new Intent(MainActivity.this, SymbolActivity.class);
                startActivity(intent5);
                break;
            case R.id.btn6:
                Intent intent6 = new Intent(MainActivity.this, BindingMethodActivity.class);
                startActivity(intent6);
                break;
            case R.id.btn7:
                Intent intent7 = new Intent(MainActivity.this, OnClickActivity.class);
                startActivity(intent7);
                break;
            case R.id.btn8:
                Intent intent8 = new Intent(MainActivity.this, TwoWayDataBindingActivity.class);
                startActivity(intent8);
                break;
            case R.id.btn9:
                Intent intent9 = new Intent(MainActivity.this, ProgressActivity.class);
                startActivity(intent9);
                break;
            default:
                break;
        }
    }
}
