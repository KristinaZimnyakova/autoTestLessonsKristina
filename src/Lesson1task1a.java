import java.util.Scanner;

public class Lesson1task1a {
    static void task1a() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���������� ������");
        Double amountRub = scanner.nextDouble();
        System.out.println("������� ���� �������");
        Double dollarExcangeRate = scanner.nextDouble();
        System.out.println(amountRub / dollarExcangeRate + " ��������");
    }
}
