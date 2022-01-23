package com.company;

import java.util.Scanner;

public class String_parameters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float greet = hello(in.nextFloat());
//        float msg = 2.34;
        System.out.println(greet);
    }
    static float hello(float name){
        float msg =name;
        return msg;
    }
}
