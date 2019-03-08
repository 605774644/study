package com.github.AbstractFactoryMethod;

/**
 * @Program: StudyDemo
 * @Description: 手机工厂
 * @Author: chenli
 * @Date: 2019-03-08 16:43
 **/
public class PhoneFactory implements Factory{
    @Override
    public Tv getTv(String name) throws ClassNotFoundException {
        return null;
    }

    @Override
    public Phone getPhone(String name) throws ClassNotFoundException {
        switch (name){
            case "Apple":
                return new ApplePhone();
            case "HuaWei":
                return new HuaWeiPhone();
            default:
                throw new ClassNotFoundException("未找到对应Tv");
        }
    }
}
