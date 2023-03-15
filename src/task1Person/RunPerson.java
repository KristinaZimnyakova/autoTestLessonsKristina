package task1Person;

import task2.FileWork;

import java.util.List;

public class RunPerson {
    public static void main(String[] args) {
        String filePathNames = String.format("%s\\FirstNames.txt", FileWork.userDir);
        List<Person> listPerson = Person.setPersons(20, filePathNames);
        Person.listToSetPersons(listPerson);
    }
}
