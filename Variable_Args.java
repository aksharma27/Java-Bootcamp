package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Variable_Args {        //when we don't know the number of inputs
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(demo(input));
    }
    static String demo(String ...name){
        System.out.println(Arrays.toString(name));
        return Arrays.toString(name);
    }
}
