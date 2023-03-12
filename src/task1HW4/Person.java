package task1HW4;

import task2.FileWork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static task2.FileWork.randomName;

public class Person {
    Integer age;
    String name;

    public Person(String filePathNames) {
        List<String> names = FileWork.fileReading(filePathNames);
        this.age = (int) (Math.random()*(100)) + 1;
        this.name = randomName(names);
    }

    public Integer getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public static void setPersons (Integer number, String filePathNames) {
        Set<Person> personSet = new HashSet<>();
        for (int i=0; i<number; i++) {
            personSet.add(new Person(filePathNames));
        }
        for (Person p: personSet) {
            System.out.println("Возраст: " + p.getAge() + " Имя: " + p.getName());
        }

    }

}
