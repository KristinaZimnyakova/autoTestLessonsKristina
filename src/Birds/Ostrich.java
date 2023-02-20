package Birds;

public class Ostrich extends Birds implements Swimming{
    @Override
    public void swim() {
        System.out.println("Плавает на поверхности");
    }
}
