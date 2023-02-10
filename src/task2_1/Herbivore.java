package task2_1;

import java.util.UUID;

import static task2_1.Animal.Meal.GRASS;
import static task2_1.Animal.Meal.MEAT;

public class Herbivore extends Animal{
    protected Herbivore(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
    }

    @Override
    protected void eat(int weightMeal, Meal meal) {
        if (meal==GRASS) {
            if (weightMeal * 3 < weight * 2) {
                System.out.println("�������� �������");
            }
            else {
                System.out.println("�������� ����");
            }
            super.eat(weightMeal, meal);
        } else {
            System.out.println("���������� ���� �����!");
        }
    }

    @Override
    protected void voice() {

    }
}
