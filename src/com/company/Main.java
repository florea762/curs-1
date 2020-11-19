package com.company;

public class Challenge_1 {
public static void main(String[] args){
        System.out.println("Challenge ");

        for(int i=1;i<=100;i++){
            if(i%3!==0 && i%5! ==0){
                System.out.println(i);
            }
            if(i%3==0){
                System.out.println("fizz, ");
            }

            if(i%5==0){
                System.out.println("buzz, ");
            }

            System.out.print(", ");
        }
    }
}
