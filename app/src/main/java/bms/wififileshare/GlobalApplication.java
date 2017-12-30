package bms.wififileshare;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

public class GlobalApplication extends Application {
    private static Context GlobalContext;

    public static Context getGlobalAppContext() {
        return GlobalApplication.GlobalContext;
    }

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        if (GlobalApplication.GlobalContext == null) {
            GlobalApplication.GlobalContext = getApplicationContext();
        }

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
    }
}
