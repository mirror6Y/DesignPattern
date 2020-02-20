package cn.mirror6.factory.code.factory;

import cn.mirror6.factory.code.product.AbstractHuman;
import cn.mirror6.factory.code.product.BlackHuman;
import cn.mirror6.factory.code.product.WhiteHuman;
import cn.mirror6.factory.code.product.YellowPeople;

/**
 * @author mirror6
 * @description
 * @date 2019/7/25 13:55
 */
public class SimpleFactory {

    public static AbstractHuman createHuman(String color) {
        AbstractHuman abstractHuman = null;
        switch (color) {
            case "yellow":
                abstractHuman = new YellowPeople();
                break;
            case "black":
                abstractHuman = new BlackHuman();
                break;
            case "white":
                abstractHuman = new WhiteHuman();
                break;
            default:
                abstractHuman = new YellowPeople();
        }
        return abstractHuman;
    }
}
