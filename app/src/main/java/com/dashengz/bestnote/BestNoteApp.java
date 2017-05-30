package com.dashengz.bestnote;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;

import java.util.Locale;

/**
 * Application class override
 */

public class BestNoteApp extends Application {

    public static Locale sDefaultSystemLocale;

    @Override
    public void onCreate() {
        super.onCreate();
        sDefaultSystemLocale = Locale.getDefault();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            sDefaultSystemLocale = newConfig.getLocales().get(0);
        else sDefaultSystemLocale = newConfig.locale;
    }

}
