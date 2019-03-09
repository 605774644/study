package com.github.AbstractFactoryMethod;

import com.github.AbstractFactoryMethod.intface.Factory;
import com.github.AbstractFactoryMethod.intface.Phone;
import com.github.AbstractFactoryMethod.intface.Tv;

/**
 * @Program: StudyDemo
 * @Description: 手机工厂
 * @Author: chenli
 * @Date: 2019-03-08 16:43
 **/
public class HaiErFactory implements Factory {
    @Override
    public Tv getTv() {
        return new HaiErTv();
    }

    @Override
    public Phone getPhone(){
        return new HaiErPhone();
    }
}
