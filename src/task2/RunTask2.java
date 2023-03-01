package task2;

import java.util.ArrayList;

public class RunTask2 {

    public static void main(String[] args){
        ArrayList<String> surname = FileWork.fileReading("C:\\Users\\79376\\Desktop\\surname.txt");
        System.out.println(surname);
        String randomeName = FileWork.randomName(surname);
        System.out.println(randomeName);
    }

}
