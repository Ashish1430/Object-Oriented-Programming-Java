package com.ashishjava;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void changeNib(){
        System.out.println("Pens Nib has been changed");
    }
    void write(){
        System.out.println("Writing........");
    }
    void refill(){
        System.out.println("Refilling the ink.....");
    }
}
public class abstarct_class_prctice_set_chapter11_cwh {
    public static void main(String[] args) {
      FountainPen p = new FountainPen();
      p.refill();
      p.changeNib();
    }
}
