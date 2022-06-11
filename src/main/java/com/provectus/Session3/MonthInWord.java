package com.provectus.Session3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthInWord {

    public static void main(String[] args) throws IOException {

        /*
        Написать программу с названием “PrintMonthInWord”, которая печатает “JAN”,
        “FEB”, …. “DEC”, если переменная “month” типа int будет 1, 2, 3, 4 … 12.. В
        противном случае программа должна вывести “Not a valid month”. Решить задачу двумя способами:
         */

        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        int[] monthNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("Please enter your month number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());

        // 1) с использованием if..else if

        for (int mN: monthNum){
            if (mN == month){
                System.out.println(months[mN - 1]);
            }
            else{
                System.out.println("Not a valid month");
            }
        }

        // 2) с использованием switch-case

        switch (month){
            case 1:
                System.out.println(months[month - 1]);
                break;
            case 2:
                System.out.println(months[month - 1]);
                break;
            case 3:
                System.out.println(months[month - 1]);
                break;
            case 4:
                System.out.println(months[month - 1]);
                break;
            case 5:
                System.out.println(months[month - 1]);
                break;
            case 6:
                System.out.println(months[month - 1]);
                break;
            case 7:
                System.out.println(months[month - 1]);
                break;
            case 8:
                System.out.println(months[month - 1]);
                break;
            case 9:
                System.out.println(months[month - 1]);
                break;
            case 10:
                System.out.println(months[month - 1]);
                break;
            case 11:
                System.out.println(months[month - 1]);
                break;
            case 12:
                System.out.println(months[month - 1]);
                break;
            default:
                System.out.println("Not a valid month");
        }
    }
}
