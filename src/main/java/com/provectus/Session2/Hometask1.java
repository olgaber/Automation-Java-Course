package com.provectus.Session2;

public class Hometask1 {
    public static void main(String[] args) {

    /*
    Написать программу, которая выводит площадь прямоугольного треугольника.
    Значения катетов задать через переменные
    */

        double cat1 = 3.7;
        double cat2 = 4.4;
        double trSquare;

        trSquare = 0.5 * cat1 * cat2;

        System.out.println("Square of the right triangle equals to " + trSquare);

    /*
    Написать программу, которая вычисляет площадь круга. Для вычислений можно использовать библиотеку Math
    (Math.pow() для возведения в квадрат)
    */

        double  cirSquare;
        double r = 7.2;

        cirSquare = Math.PI * Math.pow(r, 2);

        System.out.println("Circle square equals to " + cirSquare);

    /*
    Celsius = 5/9 (F - 32)
    Kelvin = C + 273.16
    Вывод должен быть примерно такой: C: F; K, где X - исходное значение в градусах Цельсия, Y и Z - вычисленные
    значения в Фаренгейтах и Кельвинах соответственно.
    */

        double c = 36.6;
        double f, k;

        f = c * 1.8 + 32;
        k = c + 273.16;

        System.out.println(c + " degrees Celsius equal to " + k + " kelvins" );
        System.out.println(c + " degrees Celsius equal to " + f + " degrees Fahrenheit");
    }
}
