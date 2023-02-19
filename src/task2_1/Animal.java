package task2_1;

import java.util.Random;
import java.util.UUID;

public abstract class Animal {
    float weight;
    int age;
    Gender genderAnimal;
    UUID geneticCodeAnimal;
    boolean isAlive;

    protected static Gender randomGender () {
        Random GENDER = new Random();
        Gender[] gender = Gender.values();
        return gender[GENDER.nextInt(gender.length)];
    }

    protected Animal (float weight, int age, UUID geneticCode) {
        this.weight = weight;
        this.age = age;
        this.genderAnimal = Animal.randomGender();
        this.geneticCodeAnimal = geneticCode;
        this.isAlive = true;
        System.out.println("Вес " + weight + " возраст " + age + " пол " + genderAnimal + " ген код " + geneticCodeAnimal);
    }

    protected void eat (float weightMeal, Meal meal) {
        this.weight = weight + weightMeal/25;
        System.out.println("Вес животного после еды " + meal + " " + weight);
    };

    protected void wolk() {
        System.out.println("Гуляет");
    }

    protected abstract void voice();

    public void reproduction(Animal animal1, Animal animal2) {
        if (animal1.getClass() != animal2.getClass()) {
            System.out.println("Особи должны быть одного класса");
        } else if (animal1.genderAnimal.equals(animal2.genderAnimal)) {
            System.out.println("Для размножения требуется самец и самка");
        }
        else if (animal1.isAlive && animal1.isAlive) {
            String child = animal1.geneticCodeAnimal.toString() + animal2.geneticCodeAnimal.toString();
            String childGeneticCode = child.substring(18,54);
            System.out.println("Потомтсво " + childGeneticCode);
        }
        else {
            System.out.println("Особи должны быть живыми");
        }


    }



}
