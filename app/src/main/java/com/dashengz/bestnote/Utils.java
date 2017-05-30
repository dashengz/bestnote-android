package com.dashengz.bestnote;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Utility class for BestNote
 */

public class Utils {
    public static Point getScreenSize(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size;
    }

    public static Date getDateFromMillis(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public static String getFormattedDateTimeWithLocale(Date date, int dateStyle, int timeStyle) {
        return DateFormat
                .getDateTimeInstance(dateStyle, timeStyle, BestNoteApp.sDefaultSystemLocale)
                .format(date);
    }
}
