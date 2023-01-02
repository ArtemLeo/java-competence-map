package Stream_API.Udemy_Sumin_Stream_API.Stream_API_03_Sorted_Limit_Count_AllMatch_AnyMatch_NoneMatch;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
