package com.isaac.learn.mobile;

public class MobileFactory {
    IMobile createMobile(String type){
        IMobile mobile = null;
           if(type.equalsIgnoreCase("iphone")){
               mobile= new Iphone();
               System.out.println("Iphone Object Created");
           }else if(type.equalsIgnoreCase("samsung")){
               mobile= new Samsung();
               System.out.println("Samsung Object Created");
           }
           return mobile;
    }
}
