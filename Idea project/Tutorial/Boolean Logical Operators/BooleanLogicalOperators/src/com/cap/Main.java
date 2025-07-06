package com.cap;

public class Main {
    public static void main(String[] args) {

        boolean x = false;
        boolean y = true;
        System.out.println(x);
        System.out.println(y);
        //and operator
        System.out.println(x & y);
        //or operator
        System.out.println(x | y);
        //XOR operator
        System.out.println(x ^ y);
        //short circuit AND
        System.out.println((x != y) && (y != x));
        //short circuit OR
        System.out.println(x || y);
        //not operator
        System.out.println(!x);
    }
}
