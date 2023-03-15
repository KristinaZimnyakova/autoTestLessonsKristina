package task1Person;

import task2.FileWork;

import java.util.*;

import static task2.FileWork.randomName;

public class Person {
    public Integer age;
    public String name;

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

    public static List<Person> setPersons(Integer number, String filePathNames) {
        List <Person> listPerson = new ArrayList<>();
        for (int i=0; i<number; i++) {
            listPerson.add(new Person(filePathNames));
        }
        return listPerson;
    }
    public static void listToSetPersons(List <Person> listPerson) {
        listPerson.sort(new PersonComparator());
        LinkedHashSet<Person> personLinkedHashSet = new LinkedHashSet<>(listPerson);
        for (Person p: personLinkedHashSet) {
            System.out.println("Возраст: " + p.getAge() + " Имя: " + p.getName());
        }
    }

}
