package com.github.AbstractFactoryMethod;

import com.github.AbstractFactoryMethod.intface.Factory;
import com.github.AbstractFactoryMethod.intface.Phone;
import com.github.AbstractFactoryMethod.intface.Tv;

/**
 * @Program: Study
 * @Description: 测试
 * @Author: chenli
 * @Date: 2019-03-08 15:39
 **/
public class MainTest {
    public static void main(String[] args) {
        Factory haiErFactory = new HaiErFactory();
        Phone apple = haiErFactory.getPhone();
        Tv tv = haiErFactory.getTv();
        apple.call();
        tv.see();

        SanXinFactory sanXinFactory = new SanXinFactory();
        Phone phone = sanXinFactory.getPhone();
        Tv sanXin = sanXinFactory.getTv();
        phone.call();
        sanXin.see();

    }
}
