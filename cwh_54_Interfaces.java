package com.ashishjava;
interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Design{
    void Colour();
    void Weight(int w);
}
 class AvonBicycle implements Bicycle,Design{
    public void Horn(){
        System.out.println("pee pee.......");
    }
    public void applyBrake(int decrement){
        System.out.println("Stop");
    }
    public void speedUp(int increment){
        System.out.println("Fast..........");
    }
    public void Colour(){
        System.out.println("Blue");
    }
    public void Weight(int w){
        System.out.println("The weight is "+w);
    }
 }

public class cwh_54_Interfaces {
    public static void main(String[] args) {
     AvonBicycle ashish = new AvonBicycle();
     ashish.speedUp(100);
     ashish.applyBrake(5);
     ashish.Horn();
        System.out.println(ashish.a);
        ashish.Weight(60);
        ashish.Colour();
    }
}
