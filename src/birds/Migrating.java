package birds;

public interface Migrating {
    default void migrate() {
        System.out.println("Мигрирует");
    };
}
