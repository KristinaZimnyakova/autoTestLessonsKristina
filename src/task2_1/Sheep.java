package task2_1;

import java.util.UUID;

public class Sheep extends Herbivore{
    protected Sheep(float weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("����");
    }

    @Override
    protected void voice() {
        System.out.println("���� �����");
    }
}
