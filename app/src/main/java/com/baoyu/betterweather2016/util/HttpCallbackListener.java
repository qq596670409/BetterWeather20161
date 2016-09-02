package com.baoyu.betterweather2016.util;

/**
 * Created by Administrator on 2016/9/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
