package cn.mirror6.factory.code.client;

import cn.mirror6.factory.code.factory.SimpleFactory;
import cn.mirror6.factory.code.product.AbstractHuman;

/**
 * @author mirror6
 * @description
 * @date 2019/7/25 18:33
 */
public class Client {

    public static void main(String[] args) {

        AbstractHuman yellow = SimpleFactory.createHuman("yellow");
        AbstractHuman black = SimpleFactory.createHuman("black");
        System.out.println(yellow);
        System.out.println(black);
    }
}
