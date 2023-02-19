package task2_1;

import java.util.UUID;

public class Tiger extends Predator{

    protected Tiger(float weight, int age, UUID geneticCode) {
        super(weight, age, geneticCode);
        System.out.println("Тигр");
    }
    @Override
    protected void voice() {
        System.out.println("Тигр рычит");
    }


}
