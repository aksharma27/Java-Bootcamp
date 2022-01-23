package com.company;

public class Scoping {
    static int a = 10;     //global scope

    public static void main(String[] args) {
         //scope of method main
        for (int i = 0; i<2; i++){
            int[] arr = new int[i];
            System.out.println(arr);
            System.out.println(a);

        }
        int arr = 23;
        System.out.println(a);
        System.out.println(arr);
        arr= 49;
    }

}
