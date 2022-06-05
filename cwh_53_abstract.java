package com.ashishjava;
abstract class Parent{
    public Parent(){
        System.out.println("I am Base1 Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Night");
    }
}
 abstract class Child2 extends Child{

    public void greet(){
        System.out.println("Good Night Child 2");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        // WE CANNOT CREATE OBJECT OF A ABSTRACT CLASS
     // Parent p = new Parent();
      Child c = new Child();
      // Child2 c2 = new Child2();



    }
}
