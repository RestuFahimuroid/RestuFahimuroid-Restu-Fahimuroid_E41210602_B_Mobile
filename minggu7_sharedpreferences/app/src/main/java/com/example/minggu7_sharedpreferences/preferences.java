package com.example.minggu7_sharedpreferences;
////////////////////////////////////

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

///////////////////////////////////
public class preferences {
    static final String KEY_USER_TREGISTER = "user", KEY_PASS_TREGISTER = "pass";
    static final String KEY_USERNAME_SEDANG_LOGIN = "Username_logged_in";
    static final String KEY_STATUS_SEDANG_LOGIN = "Status_logged_in";

    private static SharedPreferences getshSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static void setRegisteredUser(Context context, String username) {
        SharedPreferences.Editor editor = getshSharedPreferences(context).edit();
        editor.putString(KEY_USER_TREGISTER, username);
        editor.apply();
    }

    public static String getRegisteredUser(Context context) {
        return getshSharedPreferences(context).getString(KEY_USER_TREGISTER,"");
    }

    public static void setRegisteredPass(Context context, String password) {
        SharedPreferences.Editor editor = getshSharedPreferences(context).edit();
        editor.putString(KEY_PASS_TREGISTER, password);
        editor.apply();
    }

    public static String getLoggedinUser(Context context) {
        return getshSharedPreferences(context).getString(KEY_USERNAME_SEDANG_LOGIN, "");
    }

    public static void setLoggedInStatus(Context context, boolean status){
        SharedPreferences.Editor editor = getshSharedPreferences(context).edit();
        editor.putBoolean(KEY_STATUS_SEDANG_LOGIN,status);
        editor.apply();
    }
    public static void setLoggedInUser(Context context,String username){
        SharedPreferences.Editor editor = getshSharedPreferences(context).edit();
        editor.putString(KEY_USERNAME_SEDANG_LOGIN, username);
        editor.apply();
    }

    public static boolean getLoggedInStatus(Context context){
        return getshSharedPreferences(context).getBoolean(KEY_STATUS_SEDANG_LOGIN,false);
    }
    public static void clearLoggedInUser(Context context){
        SharedPreferences.Editor editor =getshSharedPreferences(context).edit();
        editor.remove(KEY_USERNAME_SEDANG_LOGIN);
        editor.remove(KEY_STATUS_SEDANG_LOGIN);
        editor.apply();
    }

}
