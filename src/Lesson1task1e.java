import java.util.Locale;
import java.util.Scanner;

public class Lesson1task1e {
    static void task1e() {
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        do {
            System.out.println("���-��� � ��������� �����?");
            String resident = scanner.nextLine().toLowerCase();
            if (resident.equals("�����")) {
                System.out.println("�� �������");
                break;
            } else if (resident.equals("�������")) {
                System.out.println("�� �������");
                break;
            }
            else if (resident.equals("�����")) {
                System.out.println("�� �������");
                break;
            }
            else {
                System.out.println("�� �� �������");
                count --;
            }
            if (count == 0) {
                System.out.println("�� ���������");
            }
        } while (count>0);
    }
}
