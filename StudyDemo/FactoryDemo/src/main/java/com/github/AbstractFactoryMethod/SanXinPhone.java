package com.github.AbstractFactoryMethod;

import com.github.AbstractFactoryMethod.intface.Phone;

/**
 * @Program: StudyDemo
 * @Description: 华为手机
 * @Author: chenli
 * @Date: 2019-03-08 16:38
 **/
public class SanXinPhone implements Phone {
    @Override
    public void call() {
        System.out.println("使用三星手机打电话");
    }
}
