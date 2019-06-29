package com.example.androiddesignpattern.factorypattern.simplefactorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androiddesignpattern.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jere
 */
public class SimpleFactoryPatternTestActivity extends AppCompatActivity {
    private List<String> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory_pattern_test);

        menuList = new ArrayList<>();
        Food pork = FoodFactory.getFoodByMenu("Pork");
        menuList.add(pork.get());
        Food fish = FoodFactory.getFoodByMenu("Fish");
        menuList.add(fish.get());
        Food cake = FoodFactory.getFoodByMenu("Cake");
        menuList.add(cake.get());

        String menuString = "";
        for (String menu : menuList) {
            menuString += menu + "\n";
        }
        TextView menuTv = findViewById(R.id.menu_tv);
        menuTv.setText(menuString);

    }
}
