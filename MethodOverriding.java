package com.ashishjava;
class A{
    public int a;
    public int ashish(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void method2(){
        System.out.println("I am method 2 of class B");
    }
    public void method3(){
        System.out.println("I am method 3 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A y= new A();
        y.method2();   // This will run only method of class A

        B x=new B();
        x.method2();  // This will run method of class B
    }
}
