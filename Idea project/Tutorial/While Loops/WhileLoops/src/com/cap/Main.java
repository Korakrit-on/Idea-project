package com.cap;

public class Main {
    public static void main(String[] args) {

        //Loops - a way to repeat code

        //int number = 1;
        //while (number < 100){
            //System.out.println(number);
           // number++;
       // }
       // int counter = 0;
       // while (true){
          //  counter++;
          //  System.out.println("cheese is yummy.  " + counter);
       // }
        //score below 50 = bad score
        //score above 50 = good score
        double[] test_score = {13.4, 100.0, 90.5, 32.3, 5.0};
        int index = 0; //index of the array
        while (index < test_score.length){//index = 0, length = 5
            System.out.println("Score: " + test_score[index]);

            if (test_score[index] <= 50){
                System.out.println("Bad Score: " + test_score[index]);
            }else{
                System.out.println("Good Score: " + test_score[index]);
            }

            index++;

        }
    }
}
