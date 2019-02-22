package com.example.apinstagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VIOlXbxnHeamjuQJXgoYIOZ4aGTcV4rRY6YxrStO")
                // if defined
                .clientKey("2RAmJwEYdi9iu8bR8xWEhk3Weh4MpYvPWwje3m4r")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
