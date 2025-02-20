package com.isaac.learn.mobile;

public class MultiRestoApp implements IMultiRestoApp{
    @Override
    public void displayMenu(String xmlData) {
        System.out.println("Multi Resto display menu");
    }

    @Override
    public void displayRecommendation(String xmlData) {
        System.out.println("Multi Resto display recommendation");
    }
}
