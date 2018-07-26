package com.rxda.rxda.chapterOne.setterMethod;

import com.rxda.springbootdemo.demo.chapterOne.Duck;
import com.rxda.springbootdemo.demo.chapterOne.FlyNoWay;
import com.rxda.springbootdemo.demo.chapterOne.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        this.flyBehavior=new FlyNoWay();
        this.quackBehavior=new Quack();
    }
}
