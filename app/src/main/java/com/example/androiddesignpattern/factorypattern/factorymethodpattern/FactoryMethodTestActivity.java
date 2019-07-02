package com.example.androiddesignpattern.factorypattern.factorymethodpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androiddesignpattern.R;
import com.example.androiddesignpattern.factorypattern.simplefactorypattern.Food;

/**
 * @author jere
 */
public class FactoryMethodTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method_test);

        TextView firstMenuTv = findViewById(R.id.first_menu_tv);
        TextView secondMenuTv = findViewById(R.id.second_menu_tv);

        FoodFactory porkFoodFactory = new PorkFactory();
        Food pork = porkFoodFactory.getFood();
        firstMenuTv.setText(pork.get());

        FoodFactory fishFoodFactory = new FishFactory();
        Food fish = fishFoodFactory.getFood();
        secondMenuTv.setText(fish.get());
    }
}
