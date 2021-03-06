package com.androidxx.yangjw.day31_project_mvp_demo.view.category.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yangjw on 2017/2/3.
 */
public class CategoryFragment extends Fragment {

    private Context mContext;


    /**
     * 工厂方法
     * 用来创建当前Fragment的实例对象
     * @return
     */
    public static CategoryFragment newInstance() {
        CategoryFragment homeFragment = new CategoryFragment();
        return homeFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(mContext);
        textView.setText("分类");
        return textView;
    }
}
