package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by user on 2016/8/2.
 */
public class SimpleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId("sK7CNm603KsZBdt3OUcqyZi3fuZYp604RWk74WEB")
                    .server("https://parseapi.back4app.com/")
                    .clientKey("QBjLE4lf60rucohl9F0h77zsXCHZIahDhwIYzwGQ")
                    .build());
    }
}
