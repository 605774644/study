package com.github.FactoryMethod;

/**
 * @Program: StudyDemo
 * @Description: 三星工厂
 * @Author: chenli
 * @Date: 2019-03-08 16:32
 **/
public class SanXinFactory implements Factory{
    @Override
    public Tv getTv() {
        return new SanXinTv();
    }
}
