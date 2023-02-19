package task2_1;

import java.util.UUID;

public class Wolf extends Predator {
    protected Wolf(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
        System.out.println("Волк");
    }

    @Override
    protected void voice() {
        System.out.println("Волк воет");
    }
}
