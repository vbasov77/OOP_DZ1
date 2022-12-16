//При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
//        1. Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
//        2. Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте
//        перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт,
//        соответствующий имени, объему и температуре.
//        3. В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.


package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HotDrink americano = new HotDrink("Американо", 200, 80);
        HotDrink cappuccino = new HotDrink("Капучино", 250, 60);
        HotDrink espresso = new HotDrink("Эспрессо", 50, 75);
        HotDrink tee = new HotDrink("Чай", 200, 90);

        List<AutomaticHotDrinks> vending = new ArrayList<>();
        vending.add(americano);
        vending.add(cappuccino);
        vending.add(espresso);
        vending.add(tee);


//        System.out.printf(String.format("Вам выдаётся напиток: %d", getDrink(vending)));
        System.out.println("Вам выдаётся: " + getDrink(vending));
    }

    public static String getDrink(List<AutomaticHotDrinks> drinks) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ассортимент");
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i).getName() + " объём: " + drinks.get(i).getVolume());
        }
        String drinkUser = "";
        while (true) {
            System.out.println("Введите название");
            String name = scanner.nextLine();

            for (int j = 0; j < drinks.size(); j++) {
                if (drinks.get(j).getName().equals(name)) {
                    drinkUser = String.valueOf(drinks.get(j));
                }
            }
            if (!drinkUser.isEmpty()) {
                return drinkUser;
            }
        }

    }
}