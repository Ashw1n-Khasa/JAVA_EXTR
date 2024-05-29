// Define an enumeration called Day

import java.util.Scanner;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class Enumer {
    public static void main(String[] args) {
        
       
       
        Day today = Day.MONDAY;
        

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }

        System.out.println();

        
        System.out.println("Days of the week:");
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}

