package com.company;

import java.util.Scanner;
import java.lang.String;

public class Challenge2_2 {

    static String compute2(int c) {
        String str = "";
        boolean Divizibil = false;

        if (c % 3 == 0) {
            str = str + "Foo";
            Divizibil = true;
        }

        if (c % 5 == 0) {
            str = str + "Bar";
            Divizibil = true;
        }

        if (c % 7 == 0) {
            str = str + "Qix";
            Divizibil = true;
        }


        String Num = String.valueOf(c);


        for (int i = 0; i < Num.length(); i++) {
            char d = Num.charAt(i);
            if (d == '3')
                str += "Foo";

            else if (d == '5')
                str = str + "Bar";

            else if (d == '7')
                str = str + "Qix";

            else if (d == '0')
                str += "*";

            else if (!Divizibil) {
                str += d;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Challenge 2.2");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String rez = compute2(number);
        System.out.println(rez);
    }
}

