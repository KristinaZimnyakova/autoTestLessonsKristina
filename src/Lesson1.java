import java.util.Scanner;

public class Lesson1 {

    //вариант ввода через клавиатуру
    public void task1d() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + i + " значение");
            int arrayValue = scanner.nextInt();
            array[i] = arrayValue;
        }
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max) {
                max = array[j];
            }
        }
        System.out.println("Максимальное значение " + max);
    }
    //переделать
    public void task1e() {
        String[] arrayTerem = new String[] {"мышка", "лягушка", "мишка"};
        Scanner scanner = new Scanner(System.in);
        boolean correctly=false;
        for (int i = 0; i < 5; i++) {
            if (correctly == true) {
                break;
            }
            System.out.println("Кто-кто в теремочке живет?");
            String input = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                if (input.equalsIgnoreCase(arrayTerem[j])) {
                    System.out.println("Вы угадали");
                    correctly = true;
                    break;
                }
                if (j==2) {
                    System.out.println("Вы не угадали");
                }
            }
            if (i==4) {
                System.out.println("Вы проиграли");
            }
        }

    }
}
