package com.example.androiddesignpattern.proxypattern.aidl;

import android.os.Binder;
import android.os.RemoteException;

import com.example.androiddesignpattern.proxypattern.IBankAIDL;

import java.util.UUID;

/**
 * @author jere
 */
public class BankBinder extends IBankAIDL.Stub {
    @Override
    public String openAccount(String name, String password) {
        return name + " 开户成功， 账号为：" + UUID.randomUUID().toString();
    }

    @Override
    public String saveMoney(int money, String account) {
        return "账户： " + account + " 存入：" + money + " 单位：人名币。";
    }

    @Override
    public String takeMoney(int money, String account, String password) {
        return "账户：" + account + " 取出： " + money + " 单位：人名币。";
    }

    @Override
    public String closeAccount(String account, String password) {
        return "账户：" + account + " 销户成功。";
    }
}
