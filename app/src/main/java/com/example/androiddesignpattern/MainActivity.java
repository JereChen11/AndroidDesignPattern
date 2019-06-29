package com.example.androiddesignpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androiddesignpattern.factorypattern.FactoryPatternActivity;
import com.example.androiddesignpattern.observerpattern.ObserverPatternTestActivity;
import com.example.androiddesignpattern.singletonpattern.SingleTonPatternTestActivity;

/**
 * @author jere
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button observerPatternBtn = findViewById(R.id.observer_pattern_btn);
        observerPatternBtn.setOnClickListener(this);
        Button singleTonPatternBtn = findViewById(R.id.single_ton_pattern_btn);
        singleTonPatternBtn.setOnClickListener(this);
        Button factoryPatternBtn = findViewById(R.id.factory_pattern_btn);
        factoryPatternBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.observer_pattern_btn:
                Intent observerPatternIntent = new Intent(this, ObserverPatternTestActivity.class);
                startActivity(observerPatternIntent);
                break;
            case R.id.single_ton_pattern_btn:
                Intent singleTonPatternIntent = new Intent(this, SingleTonPatternTestActivity.class);
                startActivity(singleTonPatternIntent);
                break;
            case R.id.factory_pattern_btn:
                Intent factoryPatternIntent = new Intent(this, FactoryPatternActivity.class);
                startActivity(factoryPatternIntent);
                break;
            default:
                break;
        }
    }
}
