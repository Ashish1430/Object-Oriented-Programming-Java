package com.ashishjava;
class C1{
    public int x =5;
    private int y = 45;
    int z = 6;
    protected int a = 45;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}
public class accessModifiers {
    public static void main(String[] args) {
       C1 c = new C1();
       c.meth1();
    }
}
