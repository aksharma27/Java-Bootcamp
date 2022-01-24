package com.company;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age>=18){
            for (int i = 0; i<=1; i++){
                System.out.println("You are eligible to work");
            }
        }
        else {
            System.out.println("You are not eligible to work");
        }
    }
}
