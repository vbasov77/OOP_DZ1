package org.example;

public class HotDrink extends AutomaticHotDrinks {

    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", volume=" + volume +
                        ", temperature=" + temperature +
                        '}';
    }
}
