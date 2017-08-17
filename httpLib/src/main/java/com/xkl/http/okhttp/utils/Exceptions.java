package com.xkl.http.okhttp.utils;

/**
 * Created by xkl on 17/6/16
 */
public class Exceptions
{
    public static void illegalArgument(String msg, Object... params)
    {
        throw new IllegalArgumentException(String.format(msg, params));
    }


}
