package com.dashengz.bestnote;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

/**
 * Created by Jonathan on 5/20/17.
 * <p>
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
