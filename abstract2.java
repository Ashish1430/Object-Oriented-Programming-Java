package com.ashishjava;
abstract class Phone4{
    public void name(){
        System.out.println("Nokia 3310");
    }
    abstract void Call();
    abstract void SwitchOn();
}
class SmartPhone3 extends Phone4{
    public void name(){
        System.out.println("Samsung galaxy M21");
    }
    @Override
    public void Call(){
        System.out.println("Calling.....");
    }
    @Override
    public void SwitchOn(){
        System.out.println("Android Turning On...");
    }
}
public class abstract2 {
    public static void main(String[] args) {
        Phone4 s = new SmartPhone3();  // Dynamic Method Dispatched
        s.name();

    }
}


