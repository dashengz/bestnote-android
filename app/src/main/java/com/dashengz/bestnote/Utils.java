package com.dashengz.bestnote;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

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
}
