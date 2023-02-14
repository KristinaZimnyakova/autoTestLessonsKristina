package task2_2;

public enum Drinks {
    COFE(150),
    SODA(100),
    JUICE(120);

    int price;

    Drinks(int price) {
        this.price = price;
    }
}
