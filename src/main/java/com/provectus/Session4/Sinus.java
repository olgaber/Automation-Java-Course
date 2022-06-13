package com.provectus.Session4;

public class Sinus {
    public static void main(String[] args) {
        /*
        Написать программу, которая печатает таблицу значений sin(x), где x это каждые 10 градусов от 0 до 360
        */

        for (int i = 0; i <= 360; i += 10){
            System.out.println("Sin(x) for x = " + i + " is " + Math.sin((double)i));
        }
    }
}
