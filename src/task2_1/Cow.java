package task2_1;

import java.util.UUID;

public class Cow extends Herbivore{
    protected Cow(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
        System.out.println("Корова");
    }

    @Override
    protected void voice() {
        System.out.println("Корова мычит");
    }
}
