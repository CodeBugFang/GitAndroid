package android.appautoupdate.Content;

import android.app.Application;

/**
 * 全局Application
 */
public class MyAppContent extends Application{
    private boolean UpData=true;//点击按钮判断是否正在下载

    @Override
    public void onCreate() {
        super.onCreate();
    }

    private static final MyAppContent instance = new MyAppContent();

    public static MyAppContent getApplicationInstance()
    {
        return instance;
    }

    public boolean isUpData() {
        return UpData;
    }

    public void setUpData(boolean upData) {
        UpData = upData;
    }


}
