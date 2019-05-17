package com.xyz.run;

import android.Manifest;

public class Constants {
    //权限集合
    public static final String[] PERMISIONLIST = new String[]{
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE};

    public static final String[] LOCATION_PERM = new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION};

    public static final int RC_PERM = 123;

    public static final String defaule_always_message = "当前应用缺少相应的权限，您需要设置相应的权限后才可正常相关功能。";

    public static final int PERMISION_REQUEST_CODE = 1001;

}
