package com.github.AbstractFactoryMethod;

/**
 * @Program: StudyDemo
 * @Description: 苹果手机
 * @Author: chenli
 * @Date: 2019-03-08 16:39
 **/
public class ApplePhone implements Phone{
    @Override
    public void call() {
        System.out.println("使用苹果手机打电话");
    }
}
