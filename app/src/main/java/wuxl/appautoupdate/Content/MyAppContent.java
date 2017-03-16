package wuxl.appautoupdate.Content;

import android.app.Application;

public class MyAppContent extends Application{
    private boolean UpData=true;



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
