package task2_1;

import java.util.UUID;

public class Tiger extends Predator{

    public Tiger(int weight, int age, Gender gender, UUID geneticCode) {
        super(weight, age, gender, geneticCode);
        System.out.println("Тигр");
    }
    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }


}
