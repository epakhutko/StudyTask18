package com.max.idea;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(in).useLocale(Locale.ENGLISH);
        System.out.printf("input the equation: ");
        String ToSolve = inp.nextLine();
        int res;
        int a=0;
        int b=0;
        char[] decArray = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean contain;
        boolean signPlus=true;
        if (ToSolve.length()!=5) {
            System.out.printf("Incorrect input - entry length wrong");
             return;
         }
        System.out.printf("%s", ToSolve);
        char[] Arr = new char [5];
        for (int i = 0; i < 5; i++) {
            Arr[i] = ToSolve.charAt(i);
//            System.out.printf("\n%c", Arr[i]);
        }

        if (Arr[1] == '=') {

            if (Arr[0] == 'x') {
                if (Arr[3]=='-') {
                    signPlus=false;
                }
                else if (Arr[3]=='+') {
                    signPlus=true;
                }
                else {
                    System.out.printf("Incorrect input - wrong sign");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[2] == decArray[q]) {
                        contain=true;
                        a=q;
                    }
                }
                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[4] == decArray[q]) {
                        contain=true;
                        b=q;
                    }
                }

                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                //a=Arr[2];
                //b=Arr[4];
            }

            if (Arr[2] == 'x') {
                if (Arr[3]=='-') {
                    signPlus=false;
                }
                else if (Arr[3]=='+') {
                    signPlus=true;
                }
                else {
                    System.out.printf("Incorrect input- wrong sign");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[0] == decArray[q]) {
                        contain=true;
                        a=q;
                    }
                }
                if (contain == false) {
                    System.out.printf("Incorrect input - Not a number");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[4] == decArray[q]) {
                        contain=true;
                        b=-q;
                    }
                }

                if (contain == false) {
                    System.out.printf("Incorrect input - Not a number");
                    return;
                }

//                a=Arr[0];
//                b=-Arr[4];
            }

            if (Arr[4] == 'x') {
                if (Arr[3]=='-') {
                    signPlus=false;
                }
                else if (Arr[3]=='+') {
                    signPlus=true;
                }
                else {
                    System.out.printf("Incorrect input- wrong sign");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[2] == decArray[q]) {
                        contain=true;
                        b=-q;
                    }
                }
                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[0] == decArray[q]) {
                        contain=true;
                        a=q;
                    }
                }

                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                if (signPlus=false)  {
                    a=-a;
                    b=-b;
                }
                signPlus=true;
//                a=Arr[2];
//                b=-Arr[0];
            }
        }

        if (Arr[3] == '=') {

            if (Arr[4] == 'x') {
                if (Arr[1]=='-') {
                    signPlus=false;
                }
                else if (Arr[1]=='+') {
                    signPlus=true;
                }
                else {
                    System.out.printf("Incorrect input- wrong sign");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[2] == decArray[q]) {
                        contain=true;
                    }
                }
                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[4] == decArray[q]) {
                        contain=true;
                    }
                }

                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }


                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[0] == decArray[q]) {
                        contain=true;
                        a=q;
                    }
                }
                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[2] == decArray[q]) {
                        contain=true;
                        b=q;
                    }
                }

                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

//                a=Arr[0];
//                b=Arr[2];
            }

            if (Arr[0] == 'x') {
                if (Arr[1]=='-') {
                    signPlus=false;
                }
                else if (Arr[1]=='+') {
                    signPlus=true;
                }
                else {
                    System.out.printf("Incorrect input- wrong sign - %c", Arr[1]);
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[2] == decArray[q]) {
                        contain=true;
                        b=-q;
                    }
                }
                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[4] == decArray[q]) {
                        contain=true;
                        a=q;
                    }
                }

                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

//                b=-Arr[2];
//                a=Arr[4];
            }

            if (Arr[2] == 'x') {
                if (Arr[1]=='-') {
                    signPlus=false;
                }
                else if (Arr[1]=='+') {
                    signPlus=true;
                }
                else {
                    System.out.printf("Incorrect input");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[0] == decArray[q]) {
                        contain=true;
                        b=-q;
                    }
                }
                if (contain == false) {
                    System.out.printf("Incorrect input- Not a number");
                    return;
                }

                contain=false;
                for (int q=0; q<10; q++) {
                    if (Arr[4] == decArray[q]) {
                        contain=true;
                        a=q;
                    }
                }

                if (contain == false) {
                    System.out.printf("Incorrect input - Not a number");
                    return;
                }

                if (signPlus==false) {
                    a=-a;
                    b=-b;
                }

                signPlus=true;
//                a=Arr[0];
//                b=-Arr[4];
            }
        }

//        System.out.printf("\n\n%d", a);
//        System.out.printf("\n%d", b);

        if (signPlus == true)
            res=a+b;
        else {
            res=a-b;
//            System.out.printf("\n%d", res);
        }


        System.out.printf("\nSolution: %d", res);


    }
}
