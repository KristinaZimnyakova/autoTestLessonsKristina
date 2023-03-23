package task3PersonMap;

import task1Person.Person;
import task1Person.PersonGenerator;
import task2.FileWork;

import java.util.*;

public class RunTask3 {

    public static void main(String[] args) {
        String filePathNames = String.format("%s\\FirstNames.txt", FileWork.userDir);
        List<Person> listPerson = PersonGenerator.personGenerator(20, filePathNames);
        Map<String, Person> personsMap = new HashMap<>();
        listPerson.stream().forEach(i-> {
            personsMap.put(i.name, i);
        });
    }
}
