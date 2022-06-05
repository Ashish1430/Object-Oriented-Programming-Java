package com.ashishjava;
class Cylinder{
    private  int height;
    private  int radius;
    //Construtor
    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    void volume(){
        double v = Math.PI*(radius*radius)*height;
        System.out.println("Volume "+ v);
    }
    public double surfaceArea(){
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
    //Getter and Setter

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 5;
        this.breadth = 4;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
 class Sphare{
    private int radius;

    public int getRadius() {
         return radius;
     }

     public void setRadius(int radius) {
         this.radius = radius;
     }
     void volume(){
         double vc = Math.pow(4,3)*Math.PI*radius*radius*radius;
         System.out.println("Volume of Circle  "+ vc);
     }
     public double SurfaceAreaCircle(){
        return 4 * Math.PI * radius * radius;
     }
 }



public class GetterSetter {
    public static void main(String[] args) {
        /*
        // Qno 1
        Cylinder MyCylinder = new Cylinder();
        MyCylinder.setHeight(10);
        MyCylinder.setRadius(7);
        System.out.println("height"+ MyCylinder.getHeight());
        System.out.println("radius "+ MyCylinder.getRadius());

         */
        // 2no
       // Cylinder MyCylinder = new Cylinder(12,9);
       // MyCylinder.setHeight(12);
      //  MyCylinder.setRadius(9);
     //   System.out.println("height "+ MyCylinder.getHeight());
      //  System.out.println("radius "+ MyCylinder.getRadius());
      //  MyCylinder.volume();
      //  System.out.println("TSA  "+ MyCylinder.surfaceArea());

        /* Qno 3
        Cylinder MyCylinder = new Cylinder(12,9);
        MyCylinder.volume();
        System.out.println("TSA  "+ MyCylinder.surfaceArea());
      */
        // 4No

        Rectangle r = new Rectangle(12,32); //passing argument will run overloaded constructor
        System.out.println("length "+r.getLength());
        System.out.println("breadth "+r.getBreadth());

        // 5 no
        Sphare s = new Sphare();
        s.setRadius(32);
        System.out.println("Radius of Circle  "+s.getRadius());
        s.volume();
        System.out.println("TSA  "+s.SurfaceAreaCircle() );
    }
}
