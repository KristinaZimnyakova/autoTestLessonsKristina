package Birds;

public interface Migrating {
    default void migrate() {
        System.out.println("Мигрирует");
    };
}
