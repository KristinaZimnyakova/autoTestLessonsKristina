package task1Person;

import task2.FileWork;

import java.util.*;

import static task2.FileWork.randomName;

public class Person {
    public Integer age;
    public String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    //���� ����� ��� �� �������. ������ ������������� - ����� ������ �������� �� ���-�� ����. --������
    //������ ���������� �� Stream? -- ����������, ������� � RunPerson

}
