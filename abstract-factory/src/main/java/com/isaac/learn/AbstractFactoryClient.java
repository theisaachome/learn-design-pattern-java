package com.isaac.learn;


abstract  class  CPU{}
class EmberCPU extends CPU{}
class EnginolaCPU extends CPU{}

abstract class MMU{}
class EmberMMU extends MMU{}
class EnginolaMMU extends MMU{}



enum Architecture{
    ENGINOLA,EMBER
}

class EmberToolKit extends  AbstractFactory{
    @Override
    CPU createCPU() {
        return null;
    }

    @Override
    MMU createMMU() {
        return null;
    }
}

class EnginolaToolKit extends  AbstractFactory{
    @Override
    CPU createCPU() {
        return null;
    }

    @Override
    MMU createMMU() {
        return null;
    }
}
// abstract factory class (Parent) responsible for provisioning concrete class
abstract class AbstractFactory{
    private static final  EmberToolKit EMBER_TOOLKIT = new EmberToolKit();
    private static final  EnginolaToolKit ENGINOLA_TOOLKIT = new EnginolaToolKit();


    static AbstractFactory getFactory(Architecture architecture){
        AbstractFactory factory = null;
        switch (architecture){

            case ENGINOLA:
                factory = ENGINOLA_TOOLKIT;
                break;
            case EMBER:
                factory = EMBER_TOOLKIT;
                break;
        }
        return factory;
    }
    abstract CPU createCPU();
    abstract MMU createMMU();
}
public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        CPU cpu= factory.createCPU();
        MMU mmu= factory.createMMU();
    }

}
