package com.company;

public class Shadowing {
    static int x = 10;  //x is Gobally scoped


    public static void main(String[] args) {
        System.out.println(x);//10
        int x = 39;
        System.out.println(x);// x is shadowed
        x = 49;
        System.out.println(x);//49
        int ans = method2();
        System.out.println(ans);
    }
    static int method2(){
         int x =45;
         return x;
    }
}
