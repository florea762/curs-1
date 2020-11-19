package com.company;

public class Challenge1 {
        public static void main (String[] args){
            System.out.println("Challenge 1");

            for(int i=1;i<=100;i++){
                if(i%3 != 0 && i%5 != 0 && i%7 != 0 && i%11!= 0){
                    System.out.print(i);
                }
                if(i%3==0){
                    System.out.print("Fizz");
                }

                if(i%5==0){
                    System.out.print("Buzz");
                }

                if (i % 7 == 0) {
                    System.out.print("Rizz");
                }

                System.out.print(" , ");
            }
        }
    }


