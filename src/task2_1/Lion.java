package task2_1;

import java.util.UUID;

public class Lion extends Predator{
    public Lion(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("���");
    }

    @Override
    public void voice() {
        System.out.println("��� �����");
    }
}
