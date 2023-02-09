package task2_1;

public class Run {
    public static void main(String[] args){
        Animal tiger1 = new Tiger(150, 3, Animal.randomGender(), GenerateUUID.main());
        tiger1.eat(74, Animal.Meal.GRASS);
        Animal tiger2 = new Tiger(100, 3, Animal.randomGender(), GenerateUUID.main());
        tiger2.eat(74, Animal.Meal.MEAT);
        Animal.reproduction(tiger1, tiger2);

        Animal rabbit1 = new Rabbit(5, 1, Animal.randomGender(), GenerateUUID.main());
        rabbit1.eat(1, Animal.Meal.MEAT);
        Animal rabbit2 = new Rabbit(7,2, Animal.randomGender(), GenerateUUID.main());
        rabbit2.eat(4, Animal.Meal.GRASS);
        Animal.reproduction(rabbit1, rabbit2);

        Animal[] animals = new Animal[] {tiger1, tiger2, rabbit1, rabbit2};
        for (Animal a:animals) {
            a.wolk();
            a.voice();
        }

    }
}
