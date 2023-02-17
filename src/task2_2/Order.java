package task2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Order {

    protected abstract double calculateOrder();

    static ArrayList <Drinks> orderDrinks = new ArrayList<>();
    static ArrayList <Dishes> orderDishes = new ArrayList<>();

    protected static void addDrinks(Drinks drinks) {
        orderDrinks.add(drinks);
    }
    protected static void addDishes(Dishes dishes) {
        orderDishes.add(dishes);
    }
    //логика одинаковая для online и offline заказов - на второе такое же блюдо 50% скидка
    protected double calculateDishes() {
        Map<Dishes, Integer> frequencyMap = new HashMap<>();
        for (Dishes i: orderDishes) {
            Integer count = frequencyMap.get(i);
            if (count == null) {
                count = 0;
            }
            frequencyMap.put(i, count +1);
        }
        double summDishes = 0;
        for (Map.Entry<Dishes, Integer> entry: frequencyMap.entrySet()) {
            //System.out.println("Ваш заказ блюда: " + entry.getKey() + ": " + entry.getValue());
            double summPosition = entry.getKey().price * (entry.getValue()/2*1.5) + entry.getKey().price * (entry.getValue()% 2);
            summDishes += summPosition;
        }
        //System.out.println(summDishes);
        return summDishes;
    }
    //принимает заказ
    protected static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип заказа: offline или online");
        String orderType = scanner.nextLine();
        if (orderType.equals("offline")  | orderType.equals("online")) {
            System.out.println("Введите желамые позиции из меню: COFE JUICE SODA PIZZA BURGER KEBAB \n" +
                    "Для завершения заказа введите \"Заказ окончен\"");
            while (true) {
                String orderItem = scanner.nextLine();
                if (orderItem.equals("COFE") | orderItem.equals("JUICE") | orderItem.equals("SODA")) {
                    addDrinks(Drinks.valueOf(orderItem));
                }
                else if (orderItem.equals("PIZZA") | orderItem.equals("BURGER") | orderItem.equals("KEBAB")) {
                    addDishes(Dishes.valueOf(orderItem));
                }
                else if (orderItem.equals("Заказ окончен")) {
                    break;
                }
                else {
                    System.out.println("Отсутсвующая позиция меню");
                }
            }
            if (orderType.equals("online")) {
                OnlineOrder onlineOrder = new OnlineOrder();
                double summOnlineOrder = onlineOrder.calculateOrder();
                System.out.println("Сумма к оплате Вашего online-заказа: " + summOnlineOrder);
            }
            else {
                OfflineOrder offlineOrder = new OfflineOrder();
                double summOfflineOrder = offlineOrder.calculateOrder();
                System.out.println("Сумма к оплате Вашего offline-заказа: " + summOfflineOrder);
            }
        }
        else {
            System.out.println("Недопустимый тип заказа");
        }
    }

}
