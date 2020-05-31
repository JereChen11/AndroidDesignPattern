package com.example.androiddesignpattern.proxypattern.staticProxy.rentHouseExample;

/**
 * @author jere
 * <p>
 * ProxySubject: 房产中介
 */
public class HouseAgent implements IRentHouse {
    /**
     * 被代理对象 -> 租客
     */
    private IRentHouse mRenter;

    public HouseAgent(IRentHouse renter) {
        this.mRenter = renter;
    }

    @Override
    public void findHouse() {
        mRenter.findHouse();
    }

    @Override
    public void contactLandlord() {
        mRenter.contactLandlord();
    }

    @Override
    public void signContract() {
        mRenter.signContract();
    }
}
