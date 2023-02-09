package task2_1;

import java.util.UUID;

import static task2_1.Animal.Meal.GRASS;
import static task2_1.Animal.Meal.MEAT;

public class Herbivore extends Animal{
    public Herbivore(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
    }

    @Override
    public void eat(int weightMeal, Meal meal) {
        if (meal==GRASS) {
            if (weightMeal * 3 < weight * 2) {
                System.out.println("Животное погибло");
            }
            else {
                System.out.println("Животное сыто");
            }
            super.eat(weightMeal, meal);
        } else {
            System.out.println("Травоядные едят траву!");
        }
    }

    @Override
    public void voice() {

    }
}
