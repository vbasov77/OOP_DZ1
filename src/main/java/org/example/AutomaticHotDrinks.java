package org.example;

public class AutomaticHotDrinks implements Vending {

    protected String name;
    protected int volume;

    public AutomaticHotDrinks(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {

    }

    @Override
    public String toString() {
        return "AutomaticHotDrinks{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
