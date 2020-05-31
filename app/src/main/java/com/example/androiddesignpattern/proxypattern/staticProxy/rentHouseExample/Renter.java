package com.example.androiddesignpattern.proxypattern.staticProxy.rentHouseExample;

import android.util.Log;

/**
 * @author jere
 * <p>
 * RealSubject: 租客
 */
public class Renter implements IRentHouse {
    private static final String TAG = "Renter";

    @Override
    public void findHouse() {
        Log.i(TAG, "findHouse: ");
    }

    @Override
    public void contactLandlord() {
        Log.i(TAG, "contactLandlord: ");
    }

    @Override
    public void signContract() {
        Log.i(TAG, "signContract: ");
    }
}
