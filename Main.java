package com.ashishjava;

class Employee {
    int id;
    String name;
    int sallary;
    public void PrintDetails(){
        System.out.println("My Id is "+id);
        System.out.println("My Name "+name);
    }
    public int getSallary(){
        return sallary;
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("This is our custom Class");
        //Institiation of new Employee object
        Employee ashish = new Employee();
        Employee ayush = new Employee();
        //Attributes
        ashish.id = 23;
        ashish.name= "Ashish";
        ashish.sallary = 100000;

        ayush.id = 35;
        ayush.name= "Ayush";
        ayush.sallary= 80000;
        //Printing Attributes
        //System.out.println(ashish.id);
        //System.out.println(ashish.name);
        ashish.PrintDetails();
        ayush.PrintDetails();
        // sallary of ashish
        int sallary = ashish.getSallary();
        System.out.println(sallary);
    }
}
