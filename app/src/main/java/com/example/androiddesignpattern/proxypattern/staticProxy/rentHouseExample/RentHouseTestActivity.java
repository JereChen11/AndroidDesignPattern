package com.example.androiddesignpattern.proxypattern.staticProxy.rentHouseExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * @author jere
 *
 * Client ：租房子
 */
public class RentHouseTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //租客 -》明明
        Renter mingMing = new Renter();

        //明明找了房产中介 -》小李，委托他帮忙租一个房子
        HouseAgent xiaoLi = new HouseAgent(mingMing);

        //小李开始找房子
        xiaoLi.findHouse();

        //小李找到房子后联系房东
        xiaoLi.contactLandlord();

        //小李找到房子后替明明与房东签订合同
        xiaoLi.signContract();
    }
}
