package com.company;
import java.util.Scanner;
import java.lang.String;

public class Challenge2_2 {

    static String compute2(int c){
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

            if (d == '0')
                str += '*';
        }

        if (str.isEmpty())
            return Num;
        else
            return str;
    }

    public static void main(String[] args) {
        System.out.println("Challenge 2.2");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String rez=compute2(number);
        System.out.println(rez);
    }
}
