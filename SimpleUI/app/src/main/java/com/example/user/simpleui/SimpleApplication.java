package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by user on 2016/8/2.
 */
public class SimpleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Order.class);
        ParseObject.registerSubclass(DrinkOrder.class);
        ParseObject.registerSubclass(Drink.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId("sK7CNm603KsZBdt3OUcqyZi3fuZYp604RWk74WEB")
                    .server("https://parseapi.back4app.com/")
                    .clientKey("QBjLE4lf60rucohl9F0h77zsXCHZIahDhwIYzwGQ")
                    .enableLocalDataStore()
                    .build());
    }
}
