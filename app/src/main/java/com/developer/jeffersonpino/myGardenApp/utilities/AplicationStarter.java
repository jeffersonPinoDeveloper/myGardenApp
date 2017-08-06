package com.developer.jeffersonpino.myGardenApp.utilities;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * Created by jeffersonpino on 18/06/17.
 */

public class AplicationStarter extends Application {

    SharedPreferences.Editor editor;

    @Override
    public void onCreate() {
        super.onCreate();
        //descomentar si se utiliza los ws
        /*
        // Firebase.setAndroidContext(this);
        Server.getInstance().init(EnviromentFields.SERVER_ROUTE, this);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(EnviromentFields.SHARED_PRE, MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(EnviromentFields.SP_LOGIN, EnviromentFields.SP_LOGIN_CONSTANTE);
        editor.putString(EnviromentFields.SP_PASS, EnviromentFields.SP_PASS_CONSTANTE);
        editor.apply();*/
    }

}
