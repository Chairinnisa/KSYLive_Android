package com.ksyun.live.demo.player.util;

/**
 * Created by QianYi-Xin on 2015/6/2.
 */
public interface AsyncCallback {
    void onDataCallback(String data);
    void onErrorCallback(int errorCode);
}
