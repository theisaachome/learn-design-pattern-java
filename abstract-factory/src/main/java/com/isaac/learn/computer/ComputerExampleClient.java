package com.isaac.learn.computer;


interface  Component{
    void assemble();
}

interface Gpu{
    void assemble();
}
interface Monitory{
    void assemble();
}

// Vendors
class MsiGpu implements Gpu{
    @Override
    public void assemble() {

    }
}
class MsiMonitory implements Monitory{
    @Override
    public void assemble() {

    }
}
class AsusGpu implements Gpu{
    @Override
    public void assemble() {

    }
}
class AsusMonitory implements Monitory{
    @Override
    public void assemble() {

    }
}
// abstract class
abstract class  AbstractCompany{
   abstract  Gpu createGpu();
   abstract Monitory createMonitory();
}
class MsiManufacture extends AbstractCompany{
    @Override
    Gpu createGpu() {
        return  new MsiGpu();
    }

    @Override
    Monitory createMonitory() {
        return new MsiMonitory();
    }
}

class AsusManufacture extends AbstractCompany{
    @Override
    Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    Monitory createMonitory() {
        return new AsusMonitory();
    }
}
public class ComputerExampleClient {
}
