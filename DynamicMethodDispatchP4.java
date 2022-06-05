package com.ashishjava;

class phone1{
    void greet(){
        System.out.println("GoodMorning");
    }
    void On(){
        System.out.println("Turning on Nokia 3310");
    }
}
class smartphone1 extends phone1{
    void wish(){
        System.out.println("Welcome to android");
    }
    @Override
    void On(){
        System.out.println("Turning on Samsung galaxy M21");
    }
}

public class DynamicMethodDispatchP4 {
    public static void main(String[] args) {
        //DYNAMIC METHOD DISPATCHED
        phone1 obj = new smartphone1(); // Creating object of smartphone using phone
        obj.On();
    }
}
