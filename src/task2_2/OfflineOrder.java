package task2_2;

import java.util.HashMap;
import java.util.Map;

public class OfflineOrder extends Order{

    //второй напиток в подарок в оффлайне
    public double calculateDrinksOffline() {
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
            //System.out.println("Ваш заказ напитки: " + entry.getKey() + ": " + entry.getValue());
            double summPosition = entry.getKey().price * ((entry.getValue()+2-1)/2);
            summDrinks = summDrinks + summPosition;
        }
        //System.out.println(summDrinks);
        return summDrinks;
    }
    @Override
    public double calculateOrder() {
        double summDishes = calculateDishes();
        double summDrinks = calculateDrinksOffline();
        double summOfflineorder = summDishes + summDrinks;
        return summOfflineorder;
    }

}
