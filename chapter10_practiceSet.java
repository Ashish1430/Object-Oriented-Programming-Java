package com.ashishjava;
class Circle{
   public int radius;
   Circle(int r){
       System.out.println("I am a circle Parameterized Constructor");
       this.radius=r;
   }
   public double area(){
       return Math.PI*this.radius*this.radius;
   }
}
class Cylinder1 extends Circle{
  public int height;
  Cylinder1(int r,int h){
       super(r);
      System.out.println("I am Cylinder1 Parameterized Constructor");
       this.height=h;
  }


  public double volume() {
        return super.area()*this.height;
    }
}
public class chapter10_practiceSet {
    public static void main(String[] args) {
   //Circle objc = new Circle(12);
        Cylinder1 obj = new Cylinder1(12,1);
        System.out.println(obj.volume());
        System.out.println(obj.area());
    }
}
