package com.company;

public class Challenge1__optimized {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            String str="";

            if(i%3==0)
                str=str + "Fizz";

            if(i%5==0)
                str=str + "Buzz";

            if(i%7==0)
                str+="Rizz";

            if(i%11==0)
                str=str + "Jazz";

            if(str.isEmpty())
                System.out.print(i+",");
            else
                System.out.print(str+",");
        }
    }
}
