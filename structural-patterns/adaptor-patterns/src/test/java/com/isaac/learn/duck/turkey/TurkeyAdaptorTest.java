package com.isaac.learn.duck.turkey;

import com.isaac.learn.duck.Duck;
import com.isaac.learn.duck.MallardDuck;
import org.junit.jupiter.api.Test;

class TurkeyAdaptorTest {



    @Test
    void test(){
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        TurkeyAdaptor turkeyAdaptor = new TurkeyAdaptor(turkey);

        System.out.println("The Turkey say......");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck say......");
        testDuck(duck);

        System.out.println("The TurkeyAdaptor say......");
        testDuck(turkeyAdaptor);
    }

    private  void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}