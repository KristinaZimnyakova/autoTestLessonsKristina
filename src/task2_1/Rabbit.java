package task2_1;

import java.util.UUID;

public class Rabbit extends Herbivore{
    protected Rabbit(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
        System.out.println("����");
    }

    @Override
    protected void voice() {
        System.out.println("���� ���������");
    }
}
