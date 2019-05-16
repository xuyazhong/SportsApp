package com.xyz.run;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends FragmentActivity implements View.OnClickListener {
    private EditText nick;
    private EditText pwd;
    private Button login;
    private Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nick = (EditText) findViewById(R.id.nick);
        pwd = (EditText) findViewById(R.id.pwd);
        login = (Button) findViewById(R.id.login);
        reg = (Button) findViewById(R.id.reg);
        login.setOnClickListener(this);
        reg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n = nick.getText().toString();
        String p = pwd.getText().toString();
        if(TextUtils.isEmpty(n) || TextUtils.isEmpty(p)){
            Toast.makeText(this, "密码或用户名不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        if(v == login){
//            String pn = SPUtils.getString(n);
            if(TextUtils.isEmpty(n)){
                Toast.makeText(this, "用户不存在", Toast.LENGTH_SHORT).show();
                return;
            }
            if(TextUtils.isEmpty(p)){
                Toast.makeText(this, "密码错误", Toast.LENGTH_SHORT).show();
                return;
            }
//            SPUtils.putString("user",n);
            Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,MainActivity.class));
            finish();

        }else if(v == reg){
//            SPUtils.putString(n,p);
            Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
