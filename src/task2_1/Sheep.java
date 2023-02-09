package task2_1;

import java.util.UUID;

public class Sheep extends Herbivore{
    public Sheep(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("ќвца");
    }

    @Override
    public void voice() {
        System.out.println("ќвца блеет");
    }
}
