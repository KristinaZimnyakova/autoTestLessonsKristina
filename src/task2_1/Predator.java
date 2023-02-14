package task2_1;

import java.util.UUID;

import static task2_1.Meal.MEAT;

public class Predator  extends Animal{

    protected Predator(float weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
    }

    @Override
    protected boolean eat(float weightMeal, Meal meal) {
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
        return isAlive;
    }

    @Override
    protected void voice() {

    }
}
