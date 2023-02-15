package task2_1;

import java.util.Random;
import java.util.UUID;

public abstract class Animal {
    float weight;
    int age;
    String genderAnimal;
    String geneticCodeAnimal;

    protected static Gender randomGender () {
        Random GENDER = new Random();
        Gender[] gender = Gender.values();
        return gender[GENDER.nextInt(gender.length)];
    }

    protected Animal (float weight, int age, Gender gender, UUID geneticCode) {
        this.weight = weight;
        this.age = age;
        this.genderAnimal = gender.toString();
        this.geneticCodeAnimal = geneticCode.toString();
        System.out.println("��� " + weight + " ������� " + age + " ��� " + genderAnimal + " ��� ��� " + geneticCodeAnimal);
    }

    protected boolean eat(float weightMeal, Meal meal) {
        this.weight = weight + weightMeal/25;
        System.out.println("��� ��������� ����� ��� " + meal + " " + weight);
        return false;
    };

    protected void wolk() {
        System.out.println("������");
    }

    protected abstract void voice();

    protected static void reproduction(Animal animal1, Animal animal2, boolean isAlive1, boolean isAlive2) {
        if (animal1.getClass() != animal2.getClass()) {
            System.out.println("����� ������ ���� ������ ������");
        } else if (animal1.genderAnimal.equals(animal2.genderAnimal)) {
            System.out.println("��� ����������� ��������� ����� � �����");
        }
        else if (isAlive1 && isAlive2) {
            String child = animal1.geneticCodeAnimal + animal2.geneticCodeAnimal;
            String childGeneticCode = child.substring(18,54);
            System.out.println("��������� " + childGeneticCode);
        }
        else {
            System.out.println("����� ������ ���� ������");
        }


    }



}
