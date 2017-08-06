package com.developer.jeffersonpino.myGardenApp.utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jeffersonpino on 18/06/17.
 */

public class EnviromentMethods {

    private static SharedPreferences sharedPreferences;

    public static SharedPreferences getSharedPreferences(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(EnviromentFields.SHAREPREFERENCE_DEFAULT, Context.MODE_PRIVATE);
        }
        return sharedPreferences;
    }

}
