package birds;

public class Eagle extends Birds implements Flying, Swimming, Migrating{

    @Override
    public void swim() {
        System.out.println("����� � ������� � ������");
    }
}
