package task2_1;

import java.util.UUID;

public class Cow extends Herbivore{
    protected Cow(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("Корова");
    }

    @Override
    protected void voice() {
        System.out.println("Корова мычит");
    }
}
