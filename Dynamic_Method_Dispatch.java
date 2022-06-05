package com.ashishjava;
class phone {
    public void greet() {
        System.out.println("Hello Nokia");
    }

    public void on() {
        System.out.println("Turning on feature phone");
    }
}
    class smartphone extends phone{
        @Override
        public void on(){
            System.out.println("Turning on Android Smartphone");
        }
        public void music(){
            System.out.println("Plying song......");
        }
    }
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
      //  phone obj = new phone();
      //  obj.name();
        phone obj = new smartphone();   // Allowed parents object can be child class
        // smartphone sobj = new phone();  // Not allowed
        obj.greet();
        obj.on();
       // obj.music();  Not allowed

    }
}
