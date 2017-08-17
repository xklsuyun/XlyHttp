package com.xkl.http.okhttp.callback;

/**
 * Created by xkl on 17/6/16
 */
public interface IGenericsSerializator {
    <T> T transform(String response, Class<T> classOfT);
}
