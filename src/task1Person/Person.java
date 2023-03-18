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

    //Этот метод тут не уместен. Единая отвественость - класс должен отвечать за что-то одно.
    //я бы все этот делал в main или создай класс-сет, который работает только с персонами
    public static List<Person> setPersons(Integer number, String filePathNames) {
        List <Person> listPerson = new ArrayList<>();
        for (int i=0; i<number; i++) {
            listPerson.add(new Person(filePathNames));
        }
        return listPerson;
    }
    //Зачем это метода тут? Класс персона, должен овечать только за свои внутрение свойства
    public static void listToSetPersons(List <Person> listPerson) {
        listPerson.sort(new PersonComparator());
        LinkedHashSet<Person> personLinkedHashSet = new LinkedHashSet<>(listPerson);
        //можешь переделать на Stream?
        for (Person p: personLinkedHashSet) {
            //String format
            System.out.println("Возраст: " + p.getAge() + " Имя: " + p.getName());
        }
    }

}
