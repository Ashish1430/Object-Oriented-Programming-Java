package com.ashishjava;
interface BasicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println(".....Jumping.....");
    }
    void bite(){
        System.out.println("...biting...");
    }
}
class human extends monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello object Oriented programming");
    }
    public void eat(){
        System.out.println(".....Eating.....");
    }
    public void sleep(){
        System.out.println(".....Slepping...");
    }
}

public class cwh_ch11_qno3 {
    public static void main(String[] args) {
        human h = new human();
        h.eat();
        monkey m = new human();  // This is called polymorphism
        System.out.println("This is a Polymorphism");
      //  m.speak();  -> this is not allowed, only monkey references can be used.
        m.jump();
        m.bite();
        BasicAnimal b = new human();
        b.eat();
        b.sleep();
        //b.speak(); -> error
    }
}
