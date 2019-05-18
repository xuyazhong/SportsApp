package com.xyz.run;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TabMine extends BaseFragment implements View.OnClickListener {
    private static final String TAG = TabMine.class.getSimpleName();

    //配置存储
    SharedPreferences mySharedPreferences;
    SharedPreferences.Editor editor;

    private View view;

    private TextView dayHege;
    private TextView bushu;
    private TextView haoshi;
    private TextView zonglic;
    private TextView junsu;
    private TextView kaluli;
    private TextView bmi;
    private Button logout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.view = inflater.inflate(R.layout.tab_fragment_mine, container, false);
        initViews();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        showDatas();

    }

    @Override
    public void onResume() {
        super.onResume();
        showDatas();
    }

    private void showDatas() {
        mySharedPreferences = getActivity().getSharedPreferences(
                "personalData", Activity.MODE_PRIVATE);
        editor = mySharedPreferences.edit();

        float height;//身高
        float weight;//体重
        float steplen;//步长
        int age;//年龄
        float calorie;//卡路里
        float distance;//路程
        float speed;//速度
        int steps;//步数
        int seconds;//秒数

        calorie = mySharedPreferences.getFloat("calorie", 0);
        kaluli.setText("消耗卡路里（cal）：" + calorie);

        speed = mySharedPreferences.getFloat("speed", 0);
        junsu.setText("平均速度（km/h）：" + speed);

        seconds = mySharedPreferences.getInt("seconds", 0);
        haoshi.setText("总耗时（秒）：" + seconds);

        distance = mySharedPreferences.getFloat("distance", 0);
        zonglic.setText("总里程（米）：" + distance);

        steps = mySharedPreferences.getInt("steps", 0);
        bushu.setText("总步数: " + steps);

        String result = steps > 10000 ? "合格" : "不合格";
        dayHege.setText("是否合格：" + result);

        height = mySharedPreferences.getFloat("height", 175);
        weight = mySharedPreferences.getFloat("weight", 65);
        double bmiValue = weight/((height/100)*(height/100));
        bmi.setText("BMI：" + bmiValue);
    }

    private void initViews() {

        dayHege = (TextView) view.findViewById(R.id.dayHege);
        bushu = (TextView) view.findViewById(R.id.bushu);
        haoshi = (TextView) view.findViewById(R.id.haoshi);
        zonglic = (TextView) view.findViewById(R.id.zonglic);
        junsu = (TextView) view.findViewById(R.id.junsu);
        kaluli = (TextView) view.findViewById(R.id.kaluli);
        bmi = (TextView) view.findViewById(R.id.bmi);
        logout = (Button)view.findViewById(R.id.logout);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == logout) {
            startActivity(new Intent(this.getContext(), LoginActivity.class));
        }
    }
}
