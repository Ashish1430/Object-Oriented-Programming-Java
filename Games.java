package com.ashishjava;

import java.util.Random;
import java.util.Scanner;

class GGame{
    int n,u,Rand,count=1;
    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 0 and 100:  ");
        u = sc.nextInt();
    }
    void random_number(){
        Random r = new Random();
        Rand = r.nextInt(100);
    }
    void Check(){
        if(u>Rand){
            System.out.println("Try Smaller Number");
            Input();
            count++;
            System.out.println(count + "Try");
            Check();
        }
        else if(u==Rand){
            System.out.println("Hurry! You Won The Game \nYour Points"+ count);

        }
        else{
            System.out.println("Try Bigger Value");
            Input();
            count++;
            System.out.println(count+ "Try");
            Check();
        }
    }

}

public class Games {
    public static void main(String[] args) {
      GGame p = new GGame();
      p.Input();
      p.random_number();
      p.Check();
    }
}
