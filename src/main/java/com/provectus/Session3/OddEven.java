package com.provectus.Session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {

    public static void main(String[] args) throws IOException {

        /*
        Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
        если переменная “number” типа int нечетная. Или “Even Number” если переменная
        четная. Программа всегда должна перед выходом печатать “BYE”
        */

        System.out.println("Please enter your number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a % 2 == 0){
            System.out.println(a + " is an EVEN number");
        }

        else{
            System.out.println(a + " is an ODD number");
        }

    }
}
