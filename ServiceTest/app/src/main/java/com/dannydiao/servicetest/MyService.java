package com.dannydiao.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private DownloadBinder mBinder = new DownloadBinder();
    class DownloadBinder extends Binder{

        public void startDownload(){
            Log.d("MyService","下载开始");
        }

        public int getProgress(){
            Log.d("MyService","获取进度运行中");
            return 0;
        }
    }
    @Override
    public void onCreate() {
        Log.d("MyService","服务已启动");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService","oncommand已启动");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("MyService","服务已销毁");
        super.onDestroy();
    }

    public MyService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
            return mBinder;
    }
}
