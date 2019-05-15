package com.xyz.run;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabMine extends BaseFragment {
    private static final String TAG = TabMine.class.getSimpleName();

    private View view;

    private TextView dayHege;
    private TextView bushu;
    private TextView haoshi;
    private TextView zonglic;
    private TextView junsu;
    private TextView kaluli;
    private TextView bmi;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        this.view = inflater.inflate(R.layout.tab_fragment_mine, container, false);
        Log.e(TAG, "onCreateView");
        initViews();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
        dayHege.setText("达标天数：" + 22);
        bushu.setText("总步数: " + 999);
        haoshi.setText("总耗时（秒）：" + 100);
        zonglic.setText("总里程（米）：" + 120);
        junsu.setText("平均速度（km/h）：" + 64.0);
        kaluli.setText("消耗卡路里（cal）：" + 41.6);
        bmi.setText("消耗卡路里（cal）：" + 21);

    }

    private void initViews() {


        dayHege = (TextView) view.findViewById(R.id.dayHege);
        bushu = (TextView) view.findViewById(R.id.bushu);
        haoshi = (TextView) view.findViewById(R.id.haoshi);
        zonglic = (TextView) view.findViewById(R.id.zonglic);
        junsu = (TextView) view.findViewById(R.id.junsu);
        kaluli = (TextView) view.findViewById(R.id.kaluli);
        bmi = (TextView) view.findViewById(R.id.bmi);

    }
}
