package com.github.AbstractFactoryMethod;

/**
 * @Program: StudyDemo
 * @Description: 抽象工厂
 * @Author: chenli
 * @Date: 2019-03-08 16:41
 **/
public interface Factory {
     Tv getTv(String name) throws ClassNotFoundException;
     Phone getPhone(String name) throws ClassNotFoundException;
}
