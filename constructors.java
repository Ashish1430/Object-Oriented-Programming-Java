package com.ashishjava;
// Class
class MyNewEmployee{
  private int id;
  private String Name;

  //Contructors
    public MyNewEmployee(String name, int Id){
        Name= name;
        id = Id;
    }
    //constructor Overloading
    public MyNewEmployee(){
        Name= "Overloaded Construtor";
        id = 0;
    }

  // Methods
    public void setName(String n) {this.Name = n;}
    public String getName() {return Name;}
    public void setId(int id1) {this.id= id1;}
    public int getId() {return id;}
}
public class constructors {
    public static void main(String[] args) {
        MyNewEmployee ash= new MyNewEmployee("Ashish Biswakarma",37262);
        // No Argument to call Overloaded construtor
       // MyNewEmployee ash= new MyNewEmployee();
        System.out.println(ash.getName());
        System.out.println(ash.getId());
    }
}
