package com.company;

import java.util.Scanner;

public class Func {
//    Arguments in java
    public static void main(String[] args) {
//        function call
//        Scanner in = new Scanner(System.in);
        int ans = sum(3,6,7);
        System.out.println(ans);
    }
    static int sum(int a, int b, int c){     // a and b are arguments or paraments
        int ans = a +b;
        return ans;

    }
}
