package com.xyz.run;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import java.util.concurrent.CopyOnWriteArrayList;

import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

public class Utils {

    public static boolean requestLocationPermision(Fragment context) {
        String[] Perm = Constants.LOCATION_PERM;
        if (EasyPermissions.hasPermissions(context.getContext(), Perm)) {
            return true;
        } else {
            EasyPermissions.requestPermissions(context, Constants.defaule_always_message, Constants.RC_PERM, Perm);
            return false;
        }
    }

}
