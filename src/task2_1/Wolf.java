package task2_1;

import java.util.UUID;

public class Wolf extends Predator {
    protected Wolf(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("����");
    }

    @Override
    protected void voice() {
        System.out.println("���� ����");
    }
}
