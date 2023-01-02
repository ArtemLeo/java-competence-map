package Enum.Udemy_Alishev_Enum;

public enum Animal {
    DOG("Собака"),
    CAT("Кот"),
    FROG("Лягушка");

    private final String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
