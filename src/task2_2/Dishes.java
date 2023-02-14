package task2_2;

public enum Dishes {
    PIZZA(500),
    BURGER(140),
    KEBAB(120);

    int price;

    Dishes(int price) {
        this.price = price;
    }
}
