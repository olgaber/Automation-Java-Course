package com.provectus.Session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsoscelesTriangle {
    public static void main(String[] args) throws IOException {
        /*
        Написать программу, которая определяет, является ли треугольник со сторонами a, b, c равнобедренным.
        */

        System.out.println("Please enter three numbers: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());
        System.out.println(a); //!!!!
        double b = Double.parseDouble(br.readLine());
        System.out.println(b);
        double c = Double.parseDouble(br.readLine());
        System.out.println(c);

        if (a == b && b == c){
            System.out.println("The triangle is isosceles");
        }
        else{
            System.out.println("The triangle is NOT isosceles");
        }
    }
}
