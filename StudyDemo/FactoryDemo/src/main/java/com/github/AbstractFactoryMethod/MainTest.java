package com.github.AbstractFactoryMethod;

import com.github.AbstractFactoryMethod.intface.Factory;
import com.github.AbstractFactoryMethod.intface.Phone;
import com.github.AbstractFactoryMethod.intface.Tv;

/**
 * @Program: Study
 * @Description: 测试
 * @Author: chenli
 * @Date: 2019-03-08 15:39
 **/
public class MainTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Factory phoneFactory = new HaiErFactory();
        Phone apple = phoneFactory.getPhone("Apple");
        apple.call();

        SanXinFactory tvFactory = new SanXinFactory();
        Tv sanXin = tvFactory.getTv("SanXin");
        sanXin.see();

    }
}
