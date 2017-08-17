package com.xkl.http.okhttp.utils;

import android.util.Log;

/**
 * Created by xkl on 17/6/16
 */
public class L
{
    private static boolean debug = false;

    public static void e(String msg)
    {
        if (debug)
        {
            Log.e("OkHttp", msg);
        }
    }

}

