package task2_2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Order {

    static ArrayList <Drinks> orderDrinks = new ArrayList<>();
    static ArrayList <Dishes> orderDishes = new ArrayList<>();

    public abstract double calculate();

    public static void addDrinks (Drinks drinks) {
        orderDrinks.add(drinks);
    }

    public static void addDishes (Dishes dishes) {
        orderDishes.add(dishes);
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип заказа: offline или online");
        String orderType = scanner.nextLine();
        if (orderType.equals("offline")) {
            System.out.println("Введите желамые позиции из меню");
            while (true) {
                int countDrinks = 0;
                String orderItem = scanner.nextLine();
                if (orderItem.equals("COFE") | orderItem.equals("JUICE") | orderItem.equals("SODA")) {
                    addDrinks(Drinks.valueOf(orderItem));
                    countDrinks ++;
                }
                else if (orderItem.equals("PIZZA") | orderItem.equals("BURGER") | orderItem.equals("KEBAB")) {
                    addDishes(Dishes.valueOf(orderItem));
                }
                else if (orderItem.equals("Заказ окончен")) {
                    System.out.println(orderDrinks);
                    System.out.println(orderDishes);
                    break;
                }
                else {
                    System.out.println("Отсутсвующая позиция меню");
                }
            }


        }
        else if (orderType.equals("offline")) {

        }
        else {
            System.out.println("Недопустимый тип заказа");
        }
    }
}
