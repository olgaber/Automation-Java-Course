package com.provectus.Session4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class OddNumbersToZero {
    public static void main(String[] args) {
        /*
        Написать программу, которая в массиве из случайных чисел заменяет все чётные числа на 0 и выводит полученный массив на экран.
        Для генерации случайных чисел можно использовать Random:
        Random random = new Random;
        int i = random.nextInt(100); //случайное целое число до 100
        */

        int[] arr = new int[20];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            if (arr[i] % 2 == 0){
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
