package Birds;

public class Chicken extends Birds implements Flying, Swimming {

    @Override
    public void swim() {
        System.out.println("Плавает на поверхности");

    }
}
