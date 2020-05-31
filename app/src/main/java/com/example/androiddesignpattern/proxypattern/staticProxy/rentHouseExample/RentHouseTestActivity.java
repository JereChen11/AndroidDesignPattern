package com.example.androiddesignpattern.proxypattern.staticProxy.rentHouseExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Proxy;

/**
 * @author jere
 *
 * Client ：租房子
 */
public class RentHouseTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        //租客 -》明明
//        Renter mingMing = new Renter();
//
//        //明明找了房产中介 -》小李，委托他帮忙租一个房子
//        HouseAgent xiaoLi = new HouseAgent(mingMing);
//
//        //小李开始找房子
//        xiaoLi.findHouse();
//
//        //小李找到房子后联系房东
//        xiaoLi.contactLandlord();
//
//        //小李找到房子后替明明与房东签订合同
//        xiaoLi.signContract();


        //被代理类：租客 -》明明
        Renter mingMing = new Renter();

        //构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(mingMing);
        //获取被代理类 明明 的 classLoader
        ClassLoader classLoader = mingMing.getClass().getClassLoader();

        //动态构造一个代理类 房产中介 小李
        IRentHouse xiaoLi = (IRentHouse) Proxy.newProxyInstance(classLoader, new Class[] {IRentHouse.class}, dynamicProxy);
        //小李开始找房子
        xiaoLi.findHouse();
        //小李找到房子后联系房东
        xiaoLi.contactLandlord();
        //小李找到房子后替明明与房东签订合同
        xiaoLi.signContract();


    }
}
