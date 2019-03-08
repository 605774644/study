package com.github.AbstractFactoryMethod;

/**
 * @Program: Study
 * @Description: 测试
 * @Author: chenli
 * @Date: 2019-03-08 15:39
 **/
public class MainTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Factory phoneFactory = new PhoneFactory();
        Phone apple = phoneFactory.getPhone("Apple");
        apple.call();

        TvFactory tvFactory = new TvFactory();
        Tv sanXin = tvFactory.getTv("SanXin");
        sanXin.see();

    }
}
