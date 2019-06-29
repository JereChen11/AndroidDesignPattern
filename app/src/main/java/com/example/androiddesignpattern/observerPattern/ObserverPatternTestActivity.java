package com.example.androiddesignpattern.observerPattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.androiddesignpattern.R;
import com.example.androiddesignpattern.observerPattern.functionone.FunctionOneActivity;
import com.example.androiddesignpattern.observerPattern.functiontwo.FunctionTwoActivity;

/**
 * @author jere
 */
public class ObserverPatternTestActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_pattern_test);

        Button functionOneBtn = findViewById(R.id.function_one_btn);
        functionOneBtn.setOnClickListener(this);
        Button functionTwoBtn = findViewById(R.id.function_two_btn);
        functionTwoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.function_one_btn:
                Intent intent = new Intent(this, FunctionOneActivity.class);
                startActivity(intent);
                break;
            case R.id.function_two_btn:
                Intent secondIntent = new Intent(this, FunctionTwoActivity.class);
                startActivity(secondIntent);
                break;
            default:
                break;
        }
    }
}
