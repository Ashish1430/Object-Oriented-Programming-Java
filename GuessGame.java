package com.ashishjava;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Start start = new Start();
        start.user_input();
        start.random_input();
        start.check();
    }
}
class Start{
    int num;
    int count = 1;
    int ran;
    void user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Betweeen 0 to 10");
        num = sc.nextInt();
    }
    void random_input(){
        int Rand = (int)(Math.random()*1000);
    }
    void check(){
        if(num>ran){
            System.out.println("Try smaller value");
            user_input();
            count ++;
            System.out.println(count + "try");
            check();
        }
        else if(num==ran){
            System.out.println("You won at"+ count + " try");
        }
        else{
            System.out.println("try larger value");
            user_input();
            count ++;
            System.out.println(count + "try");
            check();
        }
    }}


