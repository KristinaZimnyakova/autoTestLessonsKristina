package task3HW4;

import task2.FileWork;

import java.util.Scanner;

public class RunTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ФИО для геренации");
        Integer number = scanner.nextInt();
        String filePathNames = String.format("%s\\FirstNames.txt", FileWork.userDir);
        String filePathMiddleNames = String.format("%s\\MiddleNames.txt", FileWork.userDir);
        String filePathSecondNames = String.format("%s\\SecondNames.txt", FileWork.userDir);
        Person.listAndMapCreating(filePathNames, filePathMiddleNames, filePathSecondNames, number);
    }
}
