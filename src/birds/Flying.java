package birds;

public interface Flying {
    default void fly() {
        System.out.println("������");
    };
}
