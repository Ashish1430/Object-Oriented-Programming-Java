package com.ashishjava;
//   PARENT CLASS
class Base{
    public int x;
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int x){
        System.out.println("I am a overloaded constructor of value X as : " +x);
    }

}
//  CHILD CLASS
class Derived extends Base{
    public int y;
    Derived(){
        //super();
        System.out.println("I am a derived class constructor");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of Derived Class with value of Y as : " +y);
    }

}
//    GRAND CHILD CLASS
class GrandChild extends Derived{
    GrandChild(){
        System.out.println("I am a Child constructor of Derived Class");
    }
    GrandChild(int x, int y,int z){
        super(x,y);
        System.out.println("I am a Overloaded Child constructor of Derived Class of Value Z : "+z);
    }
}

    public class constructor_in_inheritance {
    public static void main(String[] args) {
       // Base b = new Base();
       // Derived d = new Derived();
      //  Derived d = new Derived(23,54);
        GrandChild g = new GrandChild(12,32,45);

        }
    }


