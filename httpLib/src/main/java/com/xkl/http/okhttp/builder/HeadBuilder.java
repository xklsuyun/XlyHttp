package com.xkl.http.okhttp.builder;

import com.xkl.http.okhttp.OkHttpUtils;
import com.xkl.http.okhttp.request.OtherRequest;
import com.xkl.http.okhttp.request.RequestCall;

/**
 * Created by xkl on 17/6/16
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
