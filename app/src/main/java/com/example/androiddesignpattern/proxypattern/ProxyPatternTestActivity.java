package com.example.androiddesignpattern.proxypattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androiddesignpattern.R;
import com.example.androiddesignpattern.proxypattern.aidl.ProxyPatternAIDLTestActivity;
import com.example.androiddesignpattern.proxypattern.staticProxy.StaticProxyPatternTestActivity;

/**
 * @author jere
 */
public class ProxyPatternTestActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_pattern_test);

        Button staticProxyPatternBtn = findViewById(R.id.staticProxyPatternBtn);
        staticProxyPatternBtn.setOnClickListener(this);
        Button dynamicProxyPatternBtn = findViewById(R.id.dynamicProxyPatternBtn);
        dynamicProxyPatternBtn.setOnClickListener(this);
        Button testProxyPatternAidlBtn = findViewById(R.id.testProxyPatternAIDLBtn);
        testProxyPatternAidlBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.staticProxyPatternBtn:
                Intent staticProxyPatternTestIntent = new Intent(this, StaticProxyPatternTestActivity.class);
                startActivity(staticProxyPatternTestIntent);
                break;
            case R.id.dynamicProxyPatternBtn:
                break;
            case R.id.testProxyPatternAIDLBtn:
                Intent testProxyPatternAidlIntent = new Intent(this, ProxyPatternAIDLTestActivity.class);
                startActivity(testProxyPatternAidlIntent);
                break;
            default:
                break;
        }
    }
}
