package birds;

public class Penguin extends Birds implements Swimming{
    @Override
    public void swim() {
        System.out.println("Плавает на поверхности и под водой");
    }
}
