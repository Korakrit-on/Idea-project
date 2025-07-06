package com.cap;

public class Main {
    public static void main(String[] args) {
        //String john = "john";
        //switch (john){
            //case "bob":
                //System.out.println("him name is bob");
                //break;
            //case "jerry":
                //System.out.println("him name is jerry");
                //break;
            //case "gurock":
                //System.out.println("him name is gurock");
                //break;
            //default:
                //System.out.println("Fine all just print out what him name is: " + john);
        //}
        int month = 4;
        String season = null;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
            case 9:
            case 10:
            case 11:
                season = "fall";
                break;
            default:
                System.out.println("that month dosen't exist.");
        }
        System.out.println("Season : " + season);
    }
}
