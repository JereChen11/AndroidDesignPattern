package com.example.androiddesignpattern.factorypattern.simplefactorypattern;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androiddesignpattern.R;

/**
 * @author jere
 */
public class SimpleFactoryPatternTestActivity extends AppCompatActivity {
    private TextView mMenuTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory_pattern_test);

        mMenuTv = findViewById(R.id.menu_tv);
        final EditText menuEt = findViewById(R.id.menu_et);
        menuEt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    Food food = FoodFactory.getFoodByMenu(menuEt.getText().toString());
                    displayMenuFood(food.get());
                    hideKeyboard();
                    return true;
                }
                return false;
            }
        });
    }

    private void displayMenuFood(String menuFoodString) {
        mMenuTv.setText(menuFoodString);
    }

    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
