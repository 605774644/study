package com.github.SimpleFactory;

/**
 * @Program: Study
 * @Description: 电视工厂
 * @Author: chenli
 * @Date: 2019-03-08 15:19
 **/
public class TvFactory {
    Tv getTv(String name) throws ClassNotFoundException {
        switch (name){
            case "HaiEr":
                return new HaiErTv();
            case "SanXin":
                return new SanXinTv();
            default:
                throw new ClassNotFoundException("未找到对应Tv");
        }
    }
}
