package com.example.administrator.xiazai;

/**
 * Created by Administrator on 2018/5/5.
 */

public interface DownloadListener {

    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();

}
