package task2_2;

import java.util.HashMap;
import java.util.Map;

public class OnlineOrder extends Order{

    //������� � ������� ��� ������
    public double calculateDrinksOnline() {
        Map<Drinks, Integer> frequencyMap = new HashMap<>();
        for (Drinks i: orderDrinks) {
            Integer count = frequencyMap.get(i);
            if (count == null) {
                count = 0;
            }
            frequencyMap.put(i, count +1);
        }
        double summDrinks = 0;
        for (Map.Entry<Drinks, Integer> entry: frequencyMap.entrySet()) {
            //System.out.println("��� ����� �������: " + entry.getKey() + ": " + entry.getValue());
            double summPosition = entry.getKey().price * entry.getValue();
            summDrinks += summPosition;
        }
        //System.out.println(summDrinks);
        return summDrinks;
    }
    //������ �� ���� ������ ����� 15%
    @Override
    public double calculateOrder() {
        double summDrinks = calculateDrinksOnline();
        double summDishes = calculateDishes();
        double summOnlineOrder = (summDrinks + summDishes)* 0.85;
        return summOnlineOrder;
    }

}
