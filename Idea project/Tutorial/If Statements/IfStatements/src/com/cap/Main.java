package com.cap;

public class Main {
    public static void main(String[] args) {

        //If statement - a way to run code conditionally

        //anatomy of an if statement
        //if(condition){
            //code will be run if this condition evals to true

        int myAge = 20;
        int requiredAge = 20;



        //if (myAge >= requiredAge){
            //System.out.println("you can enter a bar.");
        //}else{
            //System.out.println("you cannot enter a bar.");
        //}
        //nested if statements - having an if statement inside of another if statement

        if (myAge < 18){
            System.out.println("you are a minor.");
        }else if (myAge >= 18 && myAge < 70){
            System.out.println("you are an adult.");
        } else if (myAge >= 70 && myAge < 100) {
            System.out.println("you are getting really old.");
        }else{
            System.out.println("Wow, you are still alive?");
        }

    }
}
