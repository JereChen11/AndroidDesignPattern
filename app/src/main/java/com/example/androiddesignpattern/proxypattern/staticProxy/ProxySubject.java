package com.example.androiddesignpattern.proxypattern.staticProxy;

import android.util.Log;

/**
 * @author jere
 *
 * 实现抽象主题类的代理类
 */
public class ProxySubject extends Subject {
    private static final String TAG = "ProxySubject";

    //持有真实主题的引用
    private RealSubject mRealSubject;

    public ProxySubject(RealSubject realSubject) {
        this.mRealSubject = realSubject;
    }

    @Override
    public void visit() {
        Log.i(TAG, "visit: ");
        //调用真实主题类中的 visit() 方法
        mRealSubject.visit();
    }
}
