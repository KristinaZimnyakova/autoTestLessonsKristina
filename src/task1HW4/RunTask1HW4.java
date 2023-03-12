package task1HW4;

import task2.FileWork;

public class RunTask1HW4 {
    public static void main(String[] args) {
        String filePathNames = String.format("%s\\FirstNames.txt", FileWork.userDir);
        Person.setPersons(20, filePathNames);
    }
}
