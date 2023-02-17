package task2_1;

public class Run {
    public static void main(String[] args){
        Animal tiger1 = new Tiger(150, 3, Animal.randomGender(), GenerateUUID.main());
        boolean isAliveTiger1 = tiger1.eat(75, Meal.MEAT);
        Animal tiger2 = new Tiger(100, 3, Animal.randomGender(), GenerateUUID.main());
        boolean isAliveTiger2 =  tiger2.eat(74, Meal.MEAT);
        tiger1.reproduction(tiger1, tiger2, isAliveTiger1, isAliveTiger2);

        Animal rabbit1 = new Rabbit(5, 1, Animal.randomGender(), GenerateUUID.main());
        rabbit1.eat(1, Meal.MEAT);
        boolean isAliveRabbit1 = rabbit1.eat(1, Meal.GRASS);
        Animal rabbit2 = new Rabbit(7,2, Animal.randomGender(), GenerateUUID.main());
        rabbit2.eat(5, Meal.GRASS);
        boolean isAliveRabbit2 = rabbit2.eat(6, Meal.GRASS);
        rabbit1.reproduction(rabbit1, rabbit2, isAliveRabbit1, isAliveRabbit2);

        tiger1.reproduction(tiger1, rabbit2, isAliveTiger1, isAliveRabbit2);

        Animal[] animals = new Animal[] {tiger1, tiger2, rabbit1, rabbit2};
        for (Animal a:animals) {
            a.wolk();
            a.voice();
        }

    }
}
