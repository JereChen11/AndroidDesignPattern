package com.example.androiddesignpattern.factorypattern.abstracfactorypattern;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androiddesignpattern.R;
import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Food;

/**
 * @author jere
 */
public class AbstractFactoryPatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory_pattern);

        TextView northPorkTv = findViewById(R.id.north_pork_tv);
        TextView northFishTv = findViewById(R.id.north_fish_tv);
        TextView southPorkTv = findViewById(R.id.south_pork_tv);
        TextView southFishTv = findViewById(R.id.south_fish_tv);

        SouthNorthFoodFactory southFoodFactory = new SouthFoodFactory();
        Food southPork = southFoodFactory.getPork();
        Food southFish = southFoodFactory.getFish();
        southPorkTv.setText(southPork.get());
        southFishTv.setText(southFish.get());

        SouthNorthFoodFactory northFoodFactory = new NorthFoodFactory();
        Food northPork = northFoodFactory.getPork();
        Food northFish = northFoodFactory.getFish();
        northPorkTv.setText(northPork.get());
        northFishTv.setText(northFish.get());

    }
}
