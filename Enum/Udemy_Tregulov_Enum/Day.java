package Enum.Udemy_Tregulov_Enum;

public enum Day{
    SUNDAY("Weekends are best)"),
    MONDAY("Mondays are bad!"),
    TUESDAY("Midweek days are so-so."),
    WEDNESDAY("Midweek days are so-so."),
    THURSDAY("Midweek days are so-so."),
    FRIDAY("Fridays are better)"),
    SATURDAY("Weekends are best)");

    private String mood;

    Day(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

