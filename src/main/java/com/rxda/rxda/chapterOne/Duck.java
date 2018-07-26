package com.rxda.rxda.chapterOne;

public class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck(){}
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }

    public void setPerformQuack(QuackBehavior qb){
        this.quackBehavior=qb;
    }

    public void setPerformFLy(FlyBehavior fb){
        this.flyBehavior=fb;
    }
}
