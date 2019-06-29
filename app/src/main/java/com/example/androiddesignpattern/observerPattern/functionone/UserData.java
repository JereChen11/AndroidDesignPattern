package com.example.androiddesignpattern.observerPattern.functionone;

import android.os.Handler;

import java.util.Observable;

/**
 * @author jere
 */
public class UserData extends Observable {
    private String mName;
    private String mHobby;

    public UserData() {
        getNewDataFromRemote();
    }

    private void getNewDataFromRemote() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setUserData("Jere", "playing basketball !");
            }
        }, 3000);
    }

    public void setUserData(String name, String hobby) {
        this.mName = name;
        this.mHobby = hobby;
        setChanged();
        notifyObservers();
    }

    public String getName() {
        return mName;
    }

    public String getAge() {
        return mHobby;
    }
}
