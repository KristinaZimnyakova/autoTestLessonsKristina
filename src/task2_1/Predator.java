package task2_1;

import java.util.UUID;

import static task2_1.Meal.MEAT;

public class Predator  extends Animal{

    protected Predator(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
    }

    @Override
    protected void eat(float weightMeal, Meal meal) {
        boolean isAlive;
        if (meal==MEAT) {
            double ratioPredator = 0.5;
            if (weightMeal < ratioPredator * weight) {
                System.out.println("�������� �������");
                isAlive = false;
            }
            else {
                System.out.println("�������� ����");
                isAlive = true;
            }
            super.eat(weightMeal, meal);
        } else {
            System.out.println("������ ��� ����!");
            isAlive = false;
        }
    }

    @Override
    protected void voice() {

    }
}
