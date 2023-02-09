package task2_1;

import java.util.Random;
import java.util.UUID;

public abstract class Animal {
    int weight;
    int age;
    String genderAnimal;
    String geneticCodeAnimal;

    enum Gender {
        MALE,
        FEMALE;
    }

    enum Meal {
        GRASS,
        MEAT;
    }

    public static Gender randomGender () {
        Random GENDER = new Random();
        Gender[] gender = Gender.values();
        return gender[GENDER.nextInt(gender.length)];
    }

    public Animal (int weight, int age, Gender gender, UUID geneticCode) {
        this.weight = weight;
        this.age = age;
        this.genderAnimal = gender.toString();
        this.geneticCodeAnimal = geneticCode.toString();
        System.out.println("Вес " + weight + " возраст " + age + " пол " + genderAnimal + " ген код " + geneticCodeAnimal);
    }

    public void eat(int weightMeal, Meal meal) {
        this.weight = weight + weightMeal/25;
        System.out.println("Вес животного после еды " + meal + " " + weight);
    };

    public void wolk() {
        System.out.println("Гуляет");
    }

    public abstract void voice();

    public static void reproduction (Animal animal1, Animal animal2) {
        if (animal1.genderAnimal.equals(animal2.genderAnimal)) {
            System.out.println("Для размножения требуется самец и самка");
        }
        else {
            System.out.println("Потомтсво " + animal1.geneticCodeAnimal + animal2.geneticCodeAnimal);
        }


    }



}
