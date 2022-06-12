package com.provectus.Session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magnitude {
    public static void main(String[] args) throws IOException {
        /*
        Написать программу которая будет сравнивать величину (magnitude) двух чисел. Например, если одно число = 3,
        а второе число = -9, программа должна выдать, что число -9 имеет большую величину. Для вычисления абсолютного
        значения можно использовать метод из стандартной библиотеки Math.abs()
        */

        System.out.println("Please enter two numbers: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double num1 = Double.parseDouble(br.readLine());
        System.out.println(num1); //!!!!
        double num2 = Double.parseDouble(br.readLine());
        System.out.println(num2);

        if (Math.abs(num1) > Math.abs(num2)){
            System.out.println(num1 + " has greater magnitude than " + num2);
        }
        else if (Math.abs(num1) == Math.abs(num2)){
            System.out.println(num1 + " and " + num2 + " have the same magnitude");
        }
        else{
            System.out.println(num2 + " has greater magnitude than " + num1);
        }

    }
}
