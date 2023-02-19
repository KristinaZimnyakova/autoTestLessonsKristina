package task2_1;

import java.util.UUID;

import static task2_1.Meal.GRASS;

public class Herbivore extends Animal{


    protected Herbivore(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
    }

    @Override
    protected void eat(float weightMeal, Meal meal) {
        if (meal==GRASS) {
            if (weightMeal * 3 < weight * 2) {
                System.out.println("�������� �������");
                isAlive = false;
            }
            else {
                System.out.println("�������� ����");
                isAlive = true;
            }
            super.eat(weightMeal, meal);
        } else {
            System.out.println("���������� ���� �����!");
            isAlive = false;
        }
    }

    @Override
    protected void voice() {

    }
}
