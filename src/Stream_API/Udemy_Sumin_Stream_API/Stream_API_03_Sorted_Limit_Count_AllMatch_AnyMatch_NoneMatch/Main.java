package Stream_API.Udemy_Sumin_Stream_API.Stream_API_03_Sorted_Limit_Count_AllMatch_AnyMatch_NoneMatch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        // count();
        long count = users.stream()
                .filter(user -> user.getAge() > 30)
                .count();
        System.out.println("Number of people older than 30 years = " + count);
        System.out.println("-----------------------------");

        // allMatch();
        boolean allMatch = users.stream()
                .allMatch(user -> user.getAge() > 18);
        System.out.println(allMatch);
        System.out.println("-----------------------------");

        // anyMatch();
        boolean anyMatch = users.stream()
                .anyMatch(user -> user.getAge() > 18);
        System.out.println(anyMatch);
        System.out.println("-----------------------------");

        // noneMatch();
        boolean noneMatch = users.stream()
                .noneMatch(user -> user.getAge() <= 18);
        System.out.println(noneMatch);
        System.out.println("-----------------------------");

        // sorted() and limit();
        List<User> sorted = users.stream()
                .sorted((a, b) -> Integer.compare(b.getAge(), a.getAge()))
                .limit(3).toList();
        // Output without creating a List: forEach(System.out::println);
        for (User user : sorted) {
            System.out.println(user);
        }
        System.out.println("-----------------------------");

        // Task;
        users.stream()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .filter(user -> user.getAge() < 40)
                .limit(3)
                .map(user -> user.getName())
                .forEach(System.out::println);
    }
}
