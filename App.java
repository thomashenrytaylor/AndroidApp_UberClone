package com.thomastaylor.uber;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable local data-store
        Parse.enableLocalDatastore(this);

        // connect to parse server
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fffaf129118dd18a3472250db38195946e02ded4")
                .clientKey("ab82a761ef6cc203175e2cf863f22b6a6157b687")
                .server("http://ec2-18-188-32-207.us-east-2.compute.amazonaws.com/parse")
                .build()
        );

        ParseUser.enableAutomaticUser();

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
