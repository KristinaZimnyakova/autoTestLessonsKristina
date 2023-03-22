package task1Person;

import java.util.ArrayList;
import java.util.List;

public class SetPerson {

    public static List<Person> setPersons(Integer number, String filePathNames) {
        List <Person> listPerson = new ArrayList<>();
        for (int i=0; i<number; i++) {
            listPerson.add(new Person(filePathNames));
        }
        return listPerson;
    }
}
