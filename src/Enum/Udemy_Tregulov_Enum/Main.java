package Enum.Udemy_Tregulov_Enum;

import java.util.Arrays;

public class Main {
    Day day;

    public Main(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY -> System.out.println("Mondays are bad");
            case FRIDAY -> System.out.println("Fridays are better");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are best");
            default -> System.out.println("Midweek days are so-so");
        }
    }

    public static void main(String[] args) {
        Main firstDay = new Main(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Main thirdDay = new Main(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Main fifthDay = new Main(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Main sixthDay = new Main(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Main seventhDay = new Main(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
        System.out.println("---------------------------------");

        // Display all Enum elements - values method;
        for (Day x : Day.values()) {
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(Day.values()));
        System.out.println("---------------------------------");

        // Methods: valueOf, == ;
        Day day1 = Day.MONDAY;
        System.out.println(day1.getMood());
        Day day2 = Day.valueOf("MONDAY");
        System.out.println(day2);
        System.out.println("---------------------------------");

        System.out.println(sixthDay==fifthDay);
    }
}
