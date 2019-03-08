package com.github.FactoryMethod;

/**
 * @Program: StudyDemo
 * @Description: 海尔工厂
 * @Author: chenli
 * @Date: 2019-03-08 16:29
 **/
public class HaiErFactory implements Factory{
    @Override
    public Tv getTv() {
        return new HaiErTv();
    }
}
