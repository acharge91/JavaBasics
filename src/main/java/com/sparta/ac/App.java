package com.sparta.ac;


public class App 
{
    public static void main( String[] args )
    {
        int timeOfDay = 10;
        String welcomeMessage = greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) {
        String message;
        if (timeOfDay >= 0 && timeOfDay <= 11) {
            message = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            message = "Good Afternoon!";
        } else if (timeOfDay >= 19 && timeOfDay <= 23) {
            message = "Good Evening";
        } else {
            message = "Invalid time";
        }
        return message;
    }
}
