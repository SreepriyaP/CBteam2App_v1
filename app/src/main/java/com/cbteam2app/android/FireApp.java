package com.cbteam2app.android;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by asad on 26/03/17.
 */

public class FireApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
