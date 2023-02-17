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
    //������ ���������� ��� online � offline ������� - �� ������ ����� �� ����� 50% ������
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
            //System.out.println("��� ����� �����: " + entry.getKey() + ": " + entry.getValue());
            double summPosition = entry.getKey().price * (entry.getValue()/2*1.5) + entry.getKey().price * (entry.getValue()% 2);
            summDishes += summPosition;
        }
        //System.out.println(summDishes);
        return summDishes;
    }
    //��������� �����
    protected static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ��� ������: offline ��� online");
        String orderType = scanner.nextLine();
        if (orderType.equals("offline")  | orderType.equals("online")) {
            System.out.println("������� ������� ������� �� ����: COFE JUICE SODA PIZZA BURGER KEBAB \n" +
                    "��� ���������� ������ ������� \"����� �������\"");
            while (true) {
                String orderItem = scanner.nextLine();
                if (orderItem.equals("COFE") | orderItem.equals("JUICE") | orderItem.equals("SODA")) {
                    addDrinks(Drinks.valueOf(orderItem));
                }
                else if (orderItem.equals("PIZZA") | orderItem.equals("BURGER") | orderItem.equals("KEBAB")) {
                    addDishes(Dishes.valueOf(orderItem));
                }
                else if (orderItem.equals("����� �������")) {
                    break;
                }
                else {
                    System.out.println("������������ ������� ����");
                }
            }
            if (orderType.equals("online")) {
                OnlineOrder onlineOrder = new OnlineOrder();
                double summOnlineOrder = onlineOrder.calculateOrder();
                System.out.println("����� � ������ ������ online-������: " + summOnlineOrder);
            }
            else {
                OfflineOrder offlineOrder = new OfflineOrder();
                double summOfflineOrder = offlineOrder.calculateOrder();
                System.out.println("����� � ������ ������ offline-������: " + summOfflineOrder);
            }
        }
        else {
            System.out.println("������������ ��� ������");
        }
    }

}
