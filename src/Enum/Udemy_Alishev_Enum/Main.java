package Enum.Udemy_Alishev_Enum;

public class Main {
    public static void main(String[] args) {

        // Enum Animal
        Animal animal = Animal.CAT;
        switch (animal) {
            case CAT -> System.out.println("It`s a cat!");
            case DOG -> System.out.println("It`s a dog!");
            default -> System.out.println("It`s something else");
        }
        System.out.println("----------------------------------");

        System.out.println(animal.getTranslation());

        // Methods
        System.out.println(animal.name());
        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());
        System.out.println("----------------------------------");

        // Enum Season
        Season season = Season.WINTER;
        switch (season) {
            case AUTUMN -> System.out.println("It`s cold outside!");
            case WINTER -> System.out.println("It`s too cold outside!");
            case SPRING -> System.out.println("It`s warm outside!");
            case SUMMER -> System.out.println("It`s too warm outside!");
        }
        System.out.println("----------------------------------");

        System.out.println(season.getTemperature());

        // Methods
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
        System.out.println("----------------------------------");

        // Object -> Enum -> Season
        // System.out.println(season instanceof Season); true or false
        System.out.println(season.getClass()); // what class the object belongs to
    }
}
