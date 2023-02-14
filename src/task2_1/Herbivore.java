package task2_1;

import java.util.UUID;

import static task2_1.Meal.GRASS;

public class Herbivore extends Animal{
    protected Herbivore(float weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
    }

    @Override
    protected boolean eat(float weightMeal, Meal meal) {
        boolean isAlive;
        if (meal==GRASS) {
            if (weightMeal * 3 < weight * 2) {
                System.out.println("Животное погибло");
                isAlive = false;
            }
            else {
                System.out.println("Животное сыто");
                isAlive = true;
            }
            super.eat(weightMeal, meal);
        } else {
            System.out.println("Травоядные едят траву!");
            isAlive = false;
        }
        return isAlive;
    }

    @Override
    protected void voice() {

    }
}
