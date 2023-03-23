package task1Person;

import task2.FileWork;

import java.util.ArrayList;
import java.util.List;

import static task2.FileWork.randomName;

public class PersonGenerator {

    public static List<Person> personGenerator(Integer number, String filePathNames) {
        List<String> names = FileWork.fileReading(filePathNames);
        List <Person> listPerson = new ArrayList<>();
        for (int i=0; i<number; i++) {
            listPerson.add(new Person(((int) (Math.random()*(100)) + 1), randomName(names)));
        }
        return listPerson;
    }
}
