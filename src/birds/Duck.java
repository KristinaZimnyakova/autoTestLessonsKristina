package birds;

public class Duck extends Birds implements Flying, Swimming, Migrating{
    @Override
    public void swim() {
        System.out.println("Плавает на поверхности и под водой");
    }
}
