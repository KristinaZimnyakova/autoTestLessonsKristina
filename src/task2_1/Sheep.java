package task2_1;

import java.util.UUID;

public class Sheep extends Herbivore{
    protected Sheep(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
        System.out.println("ќвца");
    }

    @Override
    protected void voice() {
        System.out.println("ќвца блеет");
    }
}
