package com.github.FactoryMethod;

/**
 * @Program: Study
 * @Description: 海尔电视
 * @Author: chenli
 * @Date: 2019-03-08 15:16
 **/
public class HaiErTv implements Tv {
    @Override
    public void see() {
        System.out.println("使用海尔电视看视频");
    }
}
