package com.company;
import java.lang.String;
import java.util.Scanner;

public class Challenge2_1 {

    static String compute(int c){
        String str = "";

        if (c % 3 == 0)
            str = str + "Foo";

        if (c % 5 == 0)
            str = str + "Bar";

        if (c % 7 == 0)
            str = str + "Qix";

        String Num = String.valueOf(c);

        for (int i = 0; i < Num.length(); i++) {
            char d=Num.charAt(i);
            if (d == '3')
                str += "Foo";

            if (d == '5')
                str = str + "Bar";

            if (d == '7')
                str = str + "Qix";

        }

        if (str.isEmpty())
            return Num;
        else
            return str;
    }

    public static void main(String[] args) {
        System.out.println("Challenge 2.1");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String rez=compute(number);
        System.out.println(rez);
    }
}
