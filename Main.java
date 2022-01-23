package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int ans = function_name();                 //function call
        System.out.println("sum is " +ans);
    }
    static int function_name(){                   //new funciton created
        System.out.println("Enter 2 numbers");
        Scanner num = new Scanner(System.in);
        int n1 = num.nextInt();
        int n2 = num.nextInt();
        int sum = n1+n2;
        return sum;                             //return statement

    }
}
