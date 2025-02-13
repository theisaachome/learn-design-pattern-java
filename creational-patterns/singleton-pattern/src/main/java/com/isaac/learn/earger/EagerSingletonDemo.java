package com.isaac.learn.earger;

class Singleton{
    private static Singleton instance = new Singleton();
    private Singleton(){
        System.out.println("EagerSingleton constructor");
    }
    public static Singleton getInstance(){
        return instance;
    }
}
public class EagerSingletonDemo {
    public static void main(String[] args) {
         Singleton.getInstance();
    }
}
