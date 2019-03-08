package com.github.AbstractFactoryMethod;

/**
 * @Program: Study
 * @Description: 三星电视
 * @Author: chenli
 * @Date: 2019-03-08 15:17
 **/
public class SanXinTv implements Tv {
    @Override
    public void see() {
        System.out.println("使用三星电视看视频");
    }
}
