package com.ashishjava;

class BaseP {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in BaseP class and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a counstructor of BaseP");
    }
}

class DerivedP extends BaseP{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in DerivedP class and setting y now");
        this.y = y;
    }
}

public class inheritP1 {
    public static void main(String[] args) {
        // CREATING OBJECT OF PARENT CLASS
        BaseP b = new BaseP();
        b.setX(12);
        System.out.println(b.getX());

        // CREATING OBJECT OF CHILD CLASS
        DerivedP d = new DerivedP();
        d.setX(15);
        System.out.println(d.getX());

        // FROM PARENT CLASS OBJECT WE CANT ACCESS TO CHILD
        BaseP c = new DerivedP();
        c.setX(11);
        System.out.println(c.getX());

        // we cant do this
       // DerivedP a = new BaseP();

        //CREATING OBJECT OF CHILD CLASS
        DerivedP a = new DerivedP();
        a.setY(111);
        System.out.println(a.getY());
        a.printMe();

    }
}
