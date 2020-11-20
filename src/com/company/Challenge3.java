package com.company;
import java.util.Scanner;

public class Challenge3 {

    static int[] deleteAtIndex(int[] arr, int b) {
        int[] c = new int[arr.length-1];
        boolean flag=false;
        for(int i=0; i<arr.length; i++) {
            if(flag==false) {
                if(i!=b) {
                    c[i] = arr[i];
                }
                else {
                    flag=true;
                }
            }
            else {
                c[i - 1] = arr[i];
            }
        }
        return c;
    }


    public static void main(String[] args) {
        System.out.println("Challenge 3");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] arr = new int[number];
        for(int i=0; i<number; i++) {
            arr[i] = input.nextInt();
        }

        int contor=0;
        boolean perechi=false;

        while (arr.length>1) {
            for(int j=1; j<arr.length; j++) {
                int sum = arr[0] + arr[j];
                if(sum==0) {
                    arr=deleteAtIndex(arr, 0);
                    arr=deleteAtIndex(arr, j-1);
                    contor++;
                    perechi=true;
                    break;
                }
            }

            if(perechi==false) {
                arr=deleteAtIndex(arr, 0);
            }
            else {
                perechi=false;
            }

        }
        System.out.println(contor);
    }
}


