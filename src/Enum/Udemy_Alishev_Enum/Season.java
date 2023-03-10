package Enum.Udemy_Alishev_Enum;

public enum Season {
    SUMMER(35), WINTER(-20), AUTUMN(10), SPRING(15);

    final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "temperature=" + temperature +
                '}';
    }
}
