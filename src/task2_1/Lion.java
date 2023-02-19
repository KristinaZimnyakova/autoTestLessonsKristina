package task2_1;

import java.util.UUID;

public class Lion extends Predator{
    protected Lion(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
        System.out.println("Лев");
    }

    @Override
    protected void voice() {
        System.out.println("Лев рычит");
    }
}
