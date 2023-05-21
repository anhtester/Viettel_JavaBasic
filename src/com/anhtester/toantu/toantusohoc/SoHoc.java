package com.anhtester.toantu.toantusohoc;

public class SoHoc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("b % a = " + (b % a));
        System.out.println("a = a + b = " + (a += b)); //a=30

        System.out.println("a = a / b = " + (a / b));
    }
}
