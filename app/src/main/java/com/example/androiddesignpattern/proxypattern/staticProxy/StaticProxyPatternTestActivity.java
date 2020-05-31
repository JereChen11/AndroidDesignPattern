package com.example.androiddesignpattern.proxypattern.staticProxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androiddesignpattern.R;

/**
 * @author jere
 */
public class StaticProxyPatternTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_proxy_pattern_test);

        //构造一个真实主题实例
        RealSubject realSubject = new RealSubject();
        //构造一个代理主题实例，并且持有刚刚构造的真实主题实例
        ProxySubject proxySubject = new ProxySubject(realSubject);
        //调用代理主题实例的 visit() 方法
        proxySubject.visit();
    }
}
