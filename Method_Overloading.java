package com.company;

import java.util.Scanner;

public class Method_Overloading {
    public static void main(String[] args) {
        String ans = fun();
        System.out.println(ans);
        fun("Ashish");
    }

    static void fun(String name){  //method 1
        System.out.println(name);
    }

    static String  fun(){    //method 2
//        System.out.println(a);
        System.out.println("Enter any string");
        Scanner in= new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}
