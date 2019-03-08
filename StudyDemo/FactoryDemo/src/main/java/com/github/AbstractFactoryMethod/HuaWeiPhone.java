package com.github.AbstractFactoryMethod;

/**
 * @Program: StudyDemo
 * @Description: 华为手机
 * @Author: chenli
 * @Date: 2019-03-08 16:38
 **/
public class HuaWeiPhone implements Phone{
    @Override
    public void call() {
        System.out.println("使用华为手机打电话");
    }
}
