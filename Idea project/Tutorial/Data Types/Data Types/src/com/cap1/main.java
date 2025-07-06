package com.cap1;

public class main {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public static void main(String[] args) {

            //integer type - int,short,long,byte
            //flothing type - float,double
            //char
            //boolean

            //byte
            byte cap = 7;

            //short
            short bo = 32000;
            //int
            int thefirstint = 5676547;
            System.out.println(thefirstint);
            System.out.println(bo);
            System.out.println(cap);
            //compute the distance of light using long
            int lightspeed = 186000;
            long days = 1000;
            long seconds = days * 24 * 60 * 60;
            long distance = lightspeed * seconds;
            System.out.println("In " + days + " days, the light will have traveled " + distance + " miles.");
            //float
            float myBankAccount = 12.99f;
            System.out.println(myBankAccount);
            //double
            double ricepower = 0.8565658658;
            System.out.println(ricepower);

            //area of circle
            double pi, r, a;
            r = 8.7;
            pi = 3.1416;
            a = pi * r * r;
            System.out.println("The Area is " + a);

            //char
            char letter = '\u1699';
            System.out.println(letter);

            //loop
            char cap2 = 1;
            for (int i = 0; i < 50000;i++){
                cap2++;
                System.out.println(cap2);

            }
            //boolean
            boolean imHot = true;
            boolean johnIsHot = false;
            System.out.println(imHot);
            System.out.println(johnIsHot);
        }
}

