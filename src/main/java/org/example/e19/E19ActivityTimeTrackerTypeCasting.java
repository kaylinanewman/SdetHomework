package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {

        double activity1 = 45.5;
        double activity2 = 30.2;
        double activity3 = 60.7;

        double totalTime = activity1 + activity2 + activity3;

        totalTime=136.4;

        int totalMinutes= (int) totalTime;

        int hours = totalMinutes/60;
        int minutes = totalMinutes%60;

        System.out.println("The original total time is " + totalTime + " minutes.");
        System.out.println("The converted time is " + hours + " hours and " + minutes + " minutes.");


    }
}
