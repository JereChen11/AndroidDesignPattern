package com.example.androiddesignpattern.proxypattern.staticProxy;

import android.util.Log;

/**
 * @author jere
 *
 * 实现抽象主题的真实主题类
 */
public class RealSubject extends Subject {
    private static final String TAG = "RealSubject";
    
    @Override
    public void visit() {
        Log.i(TAG, "visit: ");
    }
}
