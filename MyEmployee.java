package com.ashishjava;
class MyEmp{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }


}

public class MyEmployee {

    public static void main(String[] args) {
        MyEmp ashish = new MyEmp();
        ashish.setName("Ashish Biswakarma");
        System.out.println(ashish.getName());

        ashish.setId(234);
        System.out.println(ashish.getId());
    }
}


