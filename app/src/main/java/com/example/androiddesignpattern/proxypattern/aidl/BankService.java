package com.example.androiddesignpattern.proxypattern.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * @author jere
 */
public class BankService extends Service {
    public BankService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new BankBinder();
    }
}
