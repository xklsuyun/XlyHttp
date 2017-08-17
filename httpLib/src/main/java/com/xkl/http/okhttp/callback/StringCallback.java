package com.xkl.http.okhttp.callback;

import java.io.IOException;

import okhttp3.Response;

/**
 * Created by xkl on 17/6/16
 */
public abstract class StringCallback extends Callback<String>
{
    @Override
    public String parseNetworkResponse(Response response, int id) throws IOException
    {
        return response.body().string();
    }
}
