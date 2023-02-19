package task2_1;

public class Run {
    public static void main(String[] args){
        Animal tiger1 = new Tiger(150, 3, GenerateUUID.main());
        tiger1.eat(75, Meal.MEAT);
        Animal tiger2 = new Tiger(100, 3, GenerateUUID.main());
        tiger2.eat(74, Meal.MEAT);
        tiger1.reproduction(tiger1, tiger2);

        Animal rabbit1 = new Rabbit(5, 1, GenerateUUID.main());
        rabbit1.eat(1, Meal.MEAT);
        rabbit1.eat(1, Meal.GRASS);
        Animal rabbit2 = new Rabbit(7,2, GenerateUUID.main());
        rabbit2.eat(5, Meal.GRASS);
        rabbit2.eat(6, Meal.GRASS);
        rabbit1.reproduction(rabbit1, rabbit2);

        tiger1.reproduction(tiger1, rabbit2);

        Animal[] animals = new Animal[] {tiger1, tiger2, rabbit1, rabbit2};
        for (Animal a:animals) {
            a.wolk();
            a.voice();
        }

    }
}
