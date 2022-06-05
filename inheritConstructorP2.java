package com.ashishjava;

class Base5{
    Base5(){
        System.out.println("I am a constructor of base class");
    }
    Base5(int a){
        System.out.println("I am an overloaded constructor of base class with value  "+a);
    }
}
class Derived5 extends Base5 {

    Derived5(){
        // Comment down the super keyword to see the changes
       // super(5); // This will run the overloaded constructor of the Base class instead of normal Contractor
        System.out.println("I am a constructor of derived class");
    }
    Derived5(int a, int b){
        super(a);
        System.out.println("I am an overloaded constructor of derived class with value  "+b);
    }
}

class Baby extends Derived5{
    Baby(){
        System.out.println("I am baby Counstructor");
    }
    Baby(int a, int b, int c){
        super(a,b);
        System.out.println("I am overloaded baby constructor with value "+c);
    }
}
public class inheritConstructorP2 {
    public static void main(String[] args) {
       // Derived5 d = new Derived5(); // Base class constructor will run fast
       // Derived5 d1 = new Derived5(45,66); //it will run overloaded constructor of both class passing the value of 45 to base class using Super keyword.
        Baby bb = new Baby(12,13,14);
    }
}
