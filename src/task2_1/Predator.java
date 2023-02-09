package task2_1;

import java.util.UUID;

import static task2_1.Animal.Meal.MEAT;

public class Predator  extends Animal{

    public Predator(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
    }

    @Override
    public void eat(int weightMeal, Meal meal) {
        if (meal==MEAT) {
            double ratioPredator = 0.5;
            if (weightMeal < ratioPredator * weight) {
                System.out.println("�������� �������");
            }
            else {
                System.out.println("�������� ����");
            }
            super.eat(weightMeal, meal);
        } else {
            System.out.println("������ ��� ����!");
        }

    }

    @Override
    public void voice() {

    }
}
