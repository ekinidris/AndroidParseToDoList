package com.example.win7.androidparsetodolist;

/**
 * Created by Win7 on 10/17/2015.
 */
import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "7C7SacJTO7QXCAxUQq0PUmfTLeH8CD9tifGcAa2i", "jcrYiWb0hiRir44RR7syiRJYR4WB53aLHHUPNhxz"); // Your Application ID and Client Key are defined elsewhere
    }
}