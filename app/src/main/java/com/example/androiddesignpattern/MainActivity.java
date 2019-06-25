package com.example.androiddesignpattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androiddesignpattern.functionone.FunctionOneActivity;
import com.example.androiddesignpattern.functiontwo.FunctionTwoActivity;
import com.example.androiddesignpattern.singletonpattern.SingleTonPatternTestActivity;
import com.example.androiddesignpattern.singletonpattern.SingleTonVersionOne;

/**
 * @author jere
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button functionOneBtn = findViewById(R.id.function_one_btn);
        functionOneBtn.setOnClickListener(this);
        Button functionTwoBtn = findViewById(R.id.function_two_btn);
        functionTwoBtn.setOnClickListener(this);
        Button singleTonBtn = findViewById(R.id.single_ton_btn);
        singleTonBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.function_one_btn:
                Intent intent = new Intent(MainActivity.this, FunctionOneActivity.class);
                startActivity(intent);
                break;
            case R.id.function_two_btn:
                Intent secondIntent = new Intent(MainActivity.this, FunctionTwoActivity.class);
                startActivity(secondIntent);
                break;
            case R.id.single_ton_btn:
                Intent singleTonIntent = new Intent(MainActivity.this, SingleTonPatternTestActivity.class);
                startActivity(singleTonIntent);
            default:
                break;
        }
    }
}
