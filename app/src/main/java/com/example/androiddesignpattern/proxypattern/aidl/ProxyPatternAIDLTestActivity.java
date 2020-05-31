package com.example.androiddesignpattern.proxypattern.aidl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androiddesignpattern.R;
import com.example.androiddesignpattern.proxypattern.IBankAIDL;

/**
 * @author jere
 */
public class ProxyPatternAIDLTestActivity extends AppCompatActivity implements View.OnClickListener{
    private IBankAIDL mBankBinder;
    private TextView showMsgTv;

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
//            mBankBinder = (BankBinder) service;
            mBankBinder = IBankAIDL.Stub.asInterface(service);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_pattern_test_aidl);

        Intent bankServiceIntent = new Intent(this, BankService.class);
        bindService(bankServiceIntent, connection, BIND_AUTO_CREATE);

        showMsgTv = findViewById(R.id.showMsgTv);
        Button openAccountBtn = findViewById(R.id.openAccountBtn);
        openAccountBtn.setOnClickListener(this);
        Button saveMoneyBtn = findViewById(R.id.saveMoneyBtn);
        saveMoneyBtn.setOnClickListener(this);
        Button takeMoneyBtn = findViewById(R.id.takeMoneyBtn);
        takeMoneyBtn.setOnClickListener(this);
        Button closeAccount = findViewById(R.id.closeAccountBtn);
        closeAccount.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(connection);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.openAccountBtn:
                try {
                    showMsgTv.setText(mBankBinder.openAccount("Jere", "jere8888"));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.saveMoneyBtn:
                try {
                    showMsgTv.setText(mBankBinder.saveMoney(100, "Jere"));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.takeMoneyBtn:
                try {
                    showMsgTv.setText(mBankBinder.takeMoney(10, "Jere", "jere8888"));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.closeAccountBtn:
                try {
                    showMsgTv.setText(mBankBinder.closeAccount("Jere", "jere8888"));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }

}
