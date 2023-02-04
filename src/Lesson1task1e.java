import java.util.Locale;
import java.util.Scanner;

public class Lesson1task1e {
    static void task1e() {
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        do {
            System.out.println("Кто-кто в теремочке живет?");
            String resident = scanner.nextLine().toLowerCase();
            if (resident.equals("мышка")) {
                System.out.println("Вы угадали");
                break;
            } else if (resident.equals("лягушка")) {
                System.out.println("Вы угадали");
                break;
            }
            else if (resident.equals("мишка")) {
                System.out.println("Вы угадали");
                break;
            }
            else {
                System.out.println("Вы не угадали");
                count --;
            }
            if (count == 0) {
                System.out.println("Вы проиграли");
            }
        } while (count>0);
    }
}
