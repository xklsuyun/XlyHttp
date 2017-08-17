package com.xkl.http.okhttp.builder;

import java.util.Map;

/**
 * Created by xkl on 17/6/16
 */
public interface HasParamsable
{
    OkHttpRequestBuilder params(Map<String, String> params);
    OkHttpRequestBuilder addParams(String key, String val);
}
