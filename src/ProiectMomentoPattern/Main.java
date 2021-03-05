/* Scopul proiectului este de a permite jucatorilor sa se intoarca la miscarea precedenta.
Este un joc de X si 0 in care atunci cand vine randul primului jucator, in cazul in care vrea sa isi modifice miscarea,
acesta trebuie sa tasteze litera "b" iar aceasta comanda il va duce inapoi la miscarea precedenta. Dupa aceasta modificare, este tot randul
primului jucator.
 */


package ProiectMomentoPattern;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void print2dArray(char[][] arr){
        System.out.println("---------");
        for (int i=0; i < arr.length; i++) {
            System.out.print("| ");
            for (int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    static boolean[] tableCheck(char[][] arr) {
        boolean[] parameters = new boolean[2];
        byte X = 0;
        byte O = 0;
        for (int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[i].length; j++) {
                switch (arr[i][j]){
                    case ' ':
                        parameters[0]=true;
                        break;
                    case 'X':
                        X++;
                        break;
                    case 'O':
                        O++;
                        break;
                }
            }
        }
        if (Math.abs(X-O)>=2)
            parameters[1]=true;
        return parameters;
    }

    static boolean[] getWinner(char[][] arr){
        boolean[] winner = {false, false};
        char[] X = {'X' , 'X' , 'X'};
        char[] O = {'O' , 'O' , 'O'};
        char[] local = new char[3];

        for (int i = 0; i< arr.length; i++){
            local[i] = arr[i][i];
            if (Arrays.equals(arr[i],X))
                winner[0] = true;
            else {
                if (Arrays.equals(arr[i],O))
                    winner[1]= true;
            }
        }

        if (Arrays.equals(local,X))
            winner[0] = true;
        else {
            if (Arrays.equals(local,O))
                winner[1]= true;
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                local[j] = arr[j][i];
            }
            if (Arrays.equals(local,X))
                winner[0] = true;
            else {
                if (Arrays.equals(local,O))
                    winner[1]= true;
            }
        }

        for (int i=0; i<3; i++){
            local[i]=arr[i][2-i];
        }
        if (Arrays.equals(local,X))
            winner[0] = true;
        else {
            if (Arrays.equals(local,O))
                winner[1]= true;
        }

        return winner;
    }

    public static char[][] passByValue (char[][] arr) {
        char[][] copy = new char[arr.length][];
        for(int i = 0; i < arr.length; i++)
            copy[i] = arr[i].clone();
        return copy;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var table = new Table();
        var history = new History();

        history.push(table.createState());

        char[][] currentTable;
        boolean cond = true;
        String str;
        while (cond) {
            print2dArray(table.getContent());
            System.out.print("Enter the coordinates:");
            str = input.nextLine();
            if (str.isEmpty())
                str = input.nextLine();
            if (str.equals("b")){
                table.restore(history.pop());
            } else {
                currentTable = passByValue(table.getContent());
                if (str.length()==3) {
                    if( Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(2)) ){
                        if (str.charAt(1)==' '){
                            int x = Character.getNumericValue(str.charAt(0))-1;
                            int y = Character.getNumericValue(str.charAt(2))-1;
                            if ( !(x>2 || x<0 || y>2 || y<0) ){
                                int container = x;
                                x = 2 - y;
                                y = container;
                                if ( currentTable[x][y] == ' ' ) {

                                    history.push(table.createState());

                                    if (table.getTurn())
                                        currentTable[x][y] = 'X';
                                    else
                                        currentTable[x][y] = 'O';

                                    table.changeTurn();

                                    table.setContent(passByValue(currentTable));

                                    if ( getWinner(currentTable)[0] == getWinner(currentTable)[1] ) {
                                        if ( !tableCheck(currentTable)[0] ) {
                                            print2dArray(currentTable);
                                            System.out.println("Draw");
                                            cond = false;
                                        }
                                    } else {
                                        print2dArray(currentTable);
                                        if (getWinner(currentTable)[0])
                                            System.out.println("X wins");
                                        else
                                            System.out.println("O wins");
                                        cond = false;
                                    }
                                }
                                else
                                    System.out.println("This cell is occupied! Choose another one!");
                            } else
                                System.out.println("Coordinates should be from 1 to 3!");
                        } else
                            System.out.println("Not a valid set of coordinates.");
                    } else
                        System.out.println("You should enter numbers!");
                } else
                    System.out.println("Not a valid set of coordinates.");
            }
        }
    }
}