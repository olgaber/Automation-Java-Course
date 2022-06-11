package com.provectus.Session4;

import java.util.Random;

public class AverageValue {
    public static void main(String[] args) {
        /*
        Написать программу, которая считает среднее арифметическое всех элементов в массиве из 10 случайных чисел.
        */

        double arr[] = new double[10];
        double sum = 0;
        double averageVal;

        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);
            sum += arr[i];
        }

        averageVal = sum / arr.length;
        System.out.println("Average value is " + averageVal);
    }
}
