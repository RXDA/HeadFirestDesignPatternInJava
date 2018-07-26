package com.rxda.rxda.chapterOne;

import com.rxda.springbootdemo.demo.chapterOne.setterMethod.ModelDuck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MallardDuckTest {

    @Test
    void mallardDuckTest() {
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

    }

    @Test
    void setterMethodTest(){
        Duck modelDuck=new ModelDuck();
        modelDuck.performFly();
        modelDuck.setPerformFLy(new FlywithWings());
        modelDuck.performFly();
    }

}