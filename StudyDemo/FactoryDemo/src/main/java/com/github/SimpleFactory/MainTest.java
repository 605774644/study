package com.github.SimpleFactory;

/**
 * @Program: Study
 * @Description: 测试
 * @Author: chenli
 * @Date: 2019-03-08 15:39
 **/
public class MainTest {
    public static void main(String[] args) throws ClassNotFoundException {
        TvFactory tvFactory = new TvFactory();
        Tv sanXin = tvFactory.getTv("SanXin");
        sanXin.see();
    }
}
