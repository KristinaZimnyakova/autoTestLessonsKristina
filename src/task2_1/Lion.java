package task2_1;

import java.util.UUID;

public class Lion extends Predator{
    protected Lion(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("Лев");
    }

    @Override
    protected void voice() {
        System.out.println("Лев рычит");
    }
}
