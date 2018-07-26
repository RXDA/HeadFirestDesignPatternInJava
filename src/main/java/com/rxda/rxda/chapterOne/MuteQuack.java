package com.rxda.rxda.chapterOne;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
