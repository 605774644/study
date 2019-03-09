package com.github.AbstractFactoryMethod;

import com.github.AbstractFactoryMethod.intface.Factory;
import com.github.AbstractFactoryMethod.intface.Phone;
import com.github.AbstractFactoryMethod.intface.Tv;

/**
 * @Program: Study
 * @Description: 电视工厂
 * @Author: chenli
 * @Date: 2019-03-08 15:19
 **/
public class SanXinFactory implements Factory {
    @Override
    public Tv getTv() {
        return new SanXinTv();
    }

    @Override
    public Phone getPhone(){
        return new SanXinPhone();
    }
}
