package com.github.AbstractFactoryMethod;

/**
 * @Program: Study
 * @Description: 电视工厂
 * @Author: chenli
 * @Date: 2019-03-08 15:19
 **/
public class TvFactory implements Factory{
    @Override
    public Tv getTv(String name) throws ClassNotFoundException {
        switch (name){
            case "HaiEr":
                return new HaiErTv();
            case "SanXin":
                return new SanXinTv();
            default:
                throw new ClassNotFoundException("未找到对应Tv");
        }
    }

    @Override
    public Phone getPhone(String name) throws ClassNotFoundException {
        return null;
    }
}
