package Birds;

public interface Flying {
    default void fly() {
        System.out.println("Летает");
    };
}
