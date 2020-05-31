package com.example.androiddesignpattern.proxypattern.aidl;

/**
 * @author jere
 */
public interface IBank {
    /**
     * 开户
     * @param name
     * @param password
     * @return
     */
    String openAccount(String name, String password);

    /**
     * 存钱
     * @param money
     * @param account
     * @return
     */
    String saveMoney(int money, String account);

    /**
     * 取钱
     * @param money
     * @param account
     * @param password
     * @return
     */
    String takeMoney(int money, String account, String password);

    /**
     * 销户
     * @param account
     * @param password
     * @return
     */
    String closeAccount(String account, String password);
}
