package com.cap;

public class Main {
    public static void main(String[] args) {

        //Addition
        int addition = 12 + 12;
        double addition2 = 12.0 + 12.0;
        System.out.println(addition + " " + addition2);
        //Subtraction
        int subtraction = 12 - 11;
        double subtraction2 = 12.0 - 11.0;
        System.out.println(subtraction + " " + subtraction2);
        //Multiplication
        int Multiplication = 5 * 5;
        double Multiplication2 = 5.0 * 5.0;
        System.out.println(Multiplication + " " + Multiplication2);
        //division
        int division = 25 / 5;
        double division2 = 25.0 / 5.0;
        System.out.println(division + " " + division2);
        //Modulus
        int mod = 25 % 4;
        System.out.println(mod);
        double mod2 = 66.0 % 11.0;
        System.out.println(mod2);

        //compound assiagnment operation
        int plane = 25;
        //plane = plane + 5;
        plane *= 5;
        System.out.println(plane);

        int y = 245;
        int x = ++y;
        System.out.println(x);


    }
}
