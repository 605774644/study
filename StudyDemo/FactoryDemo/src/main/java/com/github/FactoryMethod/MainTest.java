package com.github.FactoryMethod;

/**
 * @Program: Study
 * @Description: 测试
 * @Author: chenli
 * @Date: 2019-03-08 15:39
 **/
public class MainTest {
    public static void main(String[] args) throws ClassNotFoundException {
        HaiErFactory haiErFactory = new HaiErFactory();
        Tv tv1 = haiErFactory.getTv();
        tv1.see();

        SanXinFactory sanXinFactory = new SanXinFactory();
        Tv tv2 = sanXinFactory.getTv();
        tv2.see();
    }
}
