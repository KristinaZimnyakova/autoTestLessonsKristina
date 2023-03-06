package task2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RunTask2 {

    public static void main(String[] args) {
        //FileWork.fileDelete();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ФИО для геренации");
        Integer number = scanner.nextInt();
        String filePathNames = String.format("%s\\FirstNames.txt", System.getProperty("user.dir"));
        String filePathMiddleNames = String.format("%s\\MiddleNames.txt", System.getProperty("user.dir"));
        String filePathSecondNames = String.format("%s\\SecondNames.txt", System.getProperty("user.dir"));
        List<String> resultList = FileWork.listFIOcreating(filePathNames, filePathMiddleNames, filePathSecondNames, number);
        FileWork.fileWriting(resultList);
    }


}
