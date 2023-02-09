package task2_1;

import java.util.UUID;

public class Rabbit extends Herbivore{
    public Rabbit(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("Заяц");
    }

    @Override
    public void voice() {
        System.out.println("Заяц барабанит");
    }
}
