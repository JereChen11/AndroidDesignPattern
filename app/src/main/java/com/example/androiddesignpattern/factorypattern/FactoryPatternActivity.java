package com.example.androiddesignpattern.factorypattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.androiddesignpattern.R;
import com.example.androiddesignpattern.factorypattern.simplefactorypattern.SimpleFactoryPatternTestActivity;

/**
 * @author jere
 */
public class FactoryPatternActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_pattern);

        Button simpleFactoryPatternBtn = findViewById(R.id.simple_factory_pattern_btn);
        simpleFactoryPatternBtn.setOnClickListener(this);
//        Button factoryPatternBtn = findViewById(R.id.factory_pattern_btn);
//        factoryPatternBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.simple_factory_pattern_btn:
                Intent simpleFactoryPatternIntent =
                        new Intent(this, SimpleFactoryPatternTestActivity.class);
                startActivity(simpleFactoryPatternIntent);
                break;
//            case R.id.factory_pattern_btn:
//                //todo
//                break;
            default:
                break;
        }
    }
}
