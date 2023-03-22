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

    //Этот метод тут не уместен. Единая отвественость - класс должен отвечать за что-то одно. --убрала
    //можешь переделать на Stream? -- переделала, вынесла в RunPerson

}
