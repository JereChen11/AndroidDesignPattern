package com.example.androiddesignpattern.proxypattern.staticProxy.rentHouseExample;

/**
 * @author jere
 * <p>
 * Subject: 租房接口
 */
public interface IRentHouse {

    /**
     * 找房子
     */
    void findHouse();

    /**
     * 联系房东
     */
    void contactLandlord();

    /**
     * 签订合同
     */
    void signContract();
}
