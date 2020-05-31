package com.example.androiddesignpattern.observerpattern.functionone;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.example.androiddesignpattern.R;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jere
 */
public class FunctionOneActivity extends AppCompatActivity implements Observer {

    private Observable mUserDataRepositoryObservable;
    private TextView mNameTv;
    private TextView mHobbyTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mNameTv = findViewById(R.id.name_tv);
        mHobbyTv = findViewById(R.id.hobby_tv);

        mUserDataRepositoryObservable = new UserData();
        mUserDataRepositoryObservable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof UserData) {
            UserData userDataRepository = (UserData) o;
            mNameTv.setText(userDataRepository.getName());
            mHobbyTv.setText(String.valueOf(userDataRepository.getAge()));
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUserDataRepositoryObservable.deleteObserver(this);
    }
}
