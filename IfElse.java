package com.company;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter your password");
        Scanner in = new Scanner(System.in);
        int password = in.nextInt();
        if (password == 1234){
//                if p then q( "p->q" )
            System.out.println("You logged in successfully");
        }
        else{
            System.out.println("Wrong password");
            System.out.println("Do you want to retry?? Enter " +
                    "yes or  no");
            String ch = in.next();
            char ans = ch.trim().charAt(0);
            if (ans == 'y' ){
                System.out.println("Re-enter your password");
                int pass = in.nextInt();
                if (pass == 1234){
                    System.out.println("You logged in successfully");
                }
                else {
                    System.out.println("Try again later");
                }
            }
            if (ans == 'n')
            {
                System.out.println("Thankyou");
            }
        }
    }
}
