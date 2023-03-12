package task3HW4;

import task2.FileWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static task2.FileWork.randomName;

public class PersonFIO {
    String secondName;
    String nameAndMiddleName;

    public PersonFIO(String secondName, String nameAndMiddleName) {
        this.secondName = secondName;
        this.nameAndMiddleName = nameAndMiddleName;
    }

    public String getNameAndMiddleName() {
        return nameAndMiddleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public static void listAndMapCreating (String filePathNames, String filePathMiddleNames, String filePathSecondNames, Integer number) {
        List<String> names = FileWork.fileReading(filePathNames);
        List<String> middleNames = FileWork.fileReading(filePathMiddleNames);
        List<String> secondNames = FileWork.fileReading(filePathSecondNames);
        List<PersonFIO> persons = new ArrayList<>();
        for (int i=0; i<number; i++) {
            String randomeName = randomName(names);
            String randomeMiddleName = randomName(middleNames);
            String randomeSecondName = randomName(secondNames);
            String nameAndMiddleName = randomeName + " " + randomeMiddleName;
            persons.add(new PersonFIO(randomeSecondName, nameAndMiddleName));
        }
        Map<String, String> personsMap = new HashMap<>();

        for (PersonFIO p: persons) {
            personsMap.put(p.getSecondName(), p.getNameAndMiddleName());
        }

        System.out.println(personsMap);
    }



}
