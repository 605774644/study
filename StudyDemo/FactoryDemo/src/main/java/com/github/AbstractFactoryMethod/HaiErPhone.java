package com.github.AbstractFactoryMethod;

import com.github.AbstractFactoryMethod.intface.Phone;

/**
 * @Program: StudyDemo
 * @Description: 苹果手机
 * @Author: chenli
 * @Date: 2019-03-08 16:39
 **/
public class HaiErPhone implements Phone {
    @Override
    public void call() {
        System.out.println("使用海尔手机打电话");
    }
}
