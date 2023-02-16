package task2_2;

import java.util.HashMap;
import java.util.Map;

public class OfflineOrder extends Order{

    public static double calculate1() {

        Map<Drinks, Integer> frequencyMap = new HashMap<>();
        for (Drinks i: orderDrinks) {
            Integer count = frequencyMap.get(i);
            if (count == null) {
                count = 0;
            }
            frequencyMap.put(i, count +1);
        }
        double summ = 0;
        for (Map.Entry<Drinks, Integer> entry: frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            double summPosition = entry.getKey().price * ((entry.getValue()+2-1)/2);
            summ = summ + summPosition;
        }
        System.out.println(summ);



        return 0;
    }



    public static void menu() {

    }

}
