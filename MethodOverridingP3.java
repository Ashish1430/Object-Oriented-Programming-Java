package com.ashishjava;

class A1 {
    int a;
    public int Ashish(int a){
        return a;
    }
    void meth2(){
        System.out.println("method 2 of class A");
    }
}
class B1 extends A1{
    @Override
    void meth2(){
        System.out.println("method 2 of Class B");
    }
    void meth3(){
        System.out.println("meth3 of class B");
    }
}
public class MethodOverridingP3 {
    public static void main(String[] args) {

        B1 b = new B1();
        b.meth2();
    }
}
