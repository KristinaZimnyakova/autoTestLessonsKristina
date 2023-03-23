package task1Person;

import task2.FileWork;

import java.util.LinkedHashSet;
import java.util.List;

public class RunPerson {
    public static void main(String[] args) {
        String filePathNames = String.format("%s\\FirstNames.txt", FileWork.userDir);
        List<Person> listPerson = PersonGenerator.personGenerator(20, filePathNames);
        listPerson.sort(new PersonComparator());
        LinkedHashSet<Person> personLinkedHashSet = new LinkedHashSet<>(listPerson);
        personLinkedHashSet.stream().forEach(i -> {System.out.println("Возраст: " + i.getAge() + " Имя: " + i.getName());});
    }
}
