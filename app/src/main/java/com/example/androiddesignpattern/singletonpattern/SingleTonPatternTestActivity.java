package com.example.androiddesignpattern.singletonpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.androiddesignpattern.R;

/**
 * @author jere
 */
public class SingleTonPatternTestActivity extends AppCompatActivity {
    private static final String TAG = "SingleTonPatternTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_ton_pattern_test);

        SingleTonVersionOne instanceOne = SingleTonVersionOne.getInstance();
        SingleTonVersionOne instanceTwo = SingleTonVersionOne.getInstance();

        Log.d(TAG, "instanceOne hash code: " + instanceOne.hashCode());
        Log.d(TAG, "instanceTwo hash code: " + instanceTwo.hashCode());

        instanceOne.setName("IM Kobe");
        instanceOne.setName("IM James");

        TextView instanceOneTv = findViewById(R.id.instance_one);
        instanceOneTv.setText(instanceOne.getName());
        TextView instanceTwoTv = findViewById(R.id.instance_two);
        instanceTwoTv.setText(instanceTwo.getName());
    }
}
