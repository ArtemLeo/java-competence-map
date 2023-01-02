package Stream_API.Udemy_Sumin_Stream_API.Stream_API_04_Optional_FindFirst_FindAny_StreamСreation;

import Stream_API.Udemy_Sumin_Stream_API.Stream_API_03_Sorted_Limit_Count_AllMatch_AnyMatch_NoneMatch.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Alex", 35));
        userList.add(new User("Max", 22));
        userList.add(new User("John", 17));
        userList.add(new User("Andrew", 33));
        userList.add(new User("Jack", 44));
        userList.add(new User("Nick", 80));
        userList.add(new User("Alice", 46));
        userList.add(new User("Helen", 11));

        // Optional - a container for the result, which may or may not contain a value;
        // To take a value from Optional, we need to do an isPresent or ifPresent check, then the GET method;
        Optional<User> oldest = userList.stream()
                //.filter(user->user.getAge()<10)
                .max((Comparator.comparingInt(User::getAge)));
        oldest.ifPresentOrElse(System.out::println, () -> System.out.println("Oldest user not found!"));
        System.out.println("----------------------------");

        // findFirst() and findAny();
        userList.stream()
                .filter(e -> e.getName().contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not fount!"));
        // or
        Optional<User> user = userList.stream()
                .filter(e -> e.getName().contains("l"))
                .findAny();
        user.ifPresentOrElse(System.out::println, () -> System.out.println("User not fount!"));
        System.out.println("----------------------------");

        // How to Create a Stream?
        // 1) call the method .stream() on a collection: nameCollection.stream();
        // 2) call the method .stream() on an array: Arrays.stream();
        // 3) call the class Stream and used it`s static methods: Stream.of() or .generate();


        // Task: Check the running time of this operation;
        List<Float> num = new ArrayList<>();
        for (int i = 0; i < 5_000_000; i++) {
            num.add((float) i);
        }
        long before = System.currentTimeMillis();
        num.parallelStream()
                .map((number) -> Math.sin(0.2f + number / 5) * Math.cos(0.2f + number / 5) * Math.cos(0.4f + number / 2))
                .collect(Collectors.toList());
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
